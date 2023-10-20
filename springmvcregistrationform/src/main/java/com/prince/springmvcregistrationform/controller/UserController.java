package com.prince.springmvcregistrationform.controller;


import com.prince.springmvcregistrationform.entity.User;
import com.prince.springmvcregistrationform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping("/")
    public String register(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "register";
    }
    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user){
        String result="error";
        System.out.println("User--->"+user);
        if(user.getPassword().equals(user.getCpassword()))
        {
            try{
                service.registerUser(user);
                return "home";
            }
            catch(Exception e){
                result ="error";
        }
        }
        return result;
    }
}
