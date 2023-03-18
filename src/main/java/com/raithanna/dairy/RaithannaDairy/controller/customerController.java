package com.raithanna.dairy.RaithannaDairy.controller;
import com.raithanna.dairy.RaithannaDairy.Service.customerService;

import com.raithanna.dairy.RaithannaDairy.models.customer;
import com.raithanna.dairy.RaithannaDairy.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class customerController {

//    @Autowired
//    private customerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers/new")
    public String createCustomerForm(Model model) {
        customer cm = new customer();
        model.addAttribute("Custome", cm);
        return "Custome";
    }
    @PostMapping("/customers")
    public String saveCustomer(Model model, customer Customer) {
        //customer maxCustomer =  customerService.getMaxOrderNo();
        customer custWithMaxCustno = customerRepository.findTopByOrderByCustnoDesc();
        Integer maxCust_no = 80;
        if (custWithMaxCustno != null) {
            maxCust_no = custWithMaxCustno.getCustno();
            System.out.println(maxCust_no);
            maxCust_no++;
        }
        Customer.setCustno(maxCust_no);
        Customer.setCode("RDML00" + (maxCust_no));
        System.out.println(Customer);
        customerRepository.save(Customer);
        customer cm = new customer();
        model.addAttribute("Custome", cm);
        return "Custome";
    }
    @RequestMapping("/customerEdit")
    public String createOrder_html(Model model, HttpSession session){
        if (session.getAttribute("loggedIn").equals("yes")){

            Iterable<customer> CustomersIterable = customerRepository.findByOrderByIdDesc();
            List<customer> Customers = new ArrayList<>();
            for (customer Customer : CustomersIterable) {
                Customers.add(Customer);
            }
            model.addAttribute("customers", Customers);
            return "customerEdit";
        }
        List<Object> messages = new ArrayList<>();
        messages.add("Login First");
        model.addAttribute("messages", messages);
        return "redirect:/login";
    }
    //getcustvalue i.e name,phonenumber,email
    @PostMapping("/getCustValues")
    public ResponseEntity<?> getCustValues(@RequestParam Map<String,String> body){
        Map<String,String> respBody = new HashMap<>();
        System.out.println(body);
        customer Customer = customerRepository.findByCode(body.get("code"));
        respBody.putIfAbsent("name", Customer.getName());
        respBody.putIfAbsent("phoneNumber", Customer.getMobileNo());
        respBody.putIfAbsent("Email", Customer.getEmail());
        return ResponseEntity.ok(respBody);
    }
    @PostMapping("/customerEdit")
    public ResponseEntity<?> customerEdit(@RequestParam Map<String,String> body){
        Map<String,String> respBody = new HashMap<>();
        System.out.println(body);
        customer Customer = customerRepository.findByCode(body.get("code"));
        Customer.setName(body.get("name"));
        Customer.setMobileNo(body.get("phone"));
        Customer.setEmail(body.get("email"));
        respBody.putIfAbsent("message", "success");
        return ResponseEntity.ok(respBody);
    }
}
