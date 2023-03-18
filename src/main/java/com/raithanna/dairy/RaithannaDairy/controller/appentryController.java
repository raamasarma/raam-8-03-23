package com.raithanna.dairy.RaithannaDairy.controller;
import com.raithanna.dairy.RaithannaDairy.models.userModel;
import com.raithanna.dairy.RaithannaDairy.repositories.UserModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
@Controller
public class appentryController {
    @Autowired
    private UserModelRepository userModelRepository;
    @GetMapping("/register")
    public String registerHtml(){
        return "register";
    }
    @PostMapping("/register")
    public String register(Model model,@ModelAttribute userModel user, HttpServletRequest request, HttpSession session){
        List<String> messages = new ArrayList<>();
        System.out.println(user);
        try{
        userModelRepository.save(user);}
        catch (Exception handlerException){
            messages.add("Error Creating your account pls retry");
            model.addAttribute("messages",messages);
            return "register";
        }
        model.addAttribute("messages",messages);
        return "redirect:/";
    }


}
