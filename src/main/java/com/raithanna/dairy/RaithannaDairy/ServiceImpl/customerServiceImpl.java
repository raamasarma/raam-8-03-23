package com.raithanna.dairy.RaithannaDairy.ServiceImpl;

import com.raithanna.dairy.RaithannaDairy.Service.customerService;
import com.raithanna.dairy.RaithannaDairy.models.customer;
import com.raithanna.dairy.RaithannaDairy.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
//public class customerServiceImpl implements customerService {
//    @Autowired
//    private CustomerRepository customerRepository;
//    @Override
//    public customer findTopByOrderByCustnoDesc() {
////        customer custWithMaxCustno= customerRepository.findTopByOrderByCustnoDesc();;
////        Integer maxCust_no = 80;
////        if (custWithMaxCustno != null) {
////            maxCust_no = custWithMaxCustno.getCustno();
////            System.out.println(maxCust_no);
////            maxCust_no++;
////        }
////        customer Customer;
////        customer.setCustno(maxCust_no);
////        customer.setCode("PDPL00" + (maxCust_no));
////        System.out.println(customer);
////        customerRepository.save(customer);
//
//        return null;
//    }
//}
