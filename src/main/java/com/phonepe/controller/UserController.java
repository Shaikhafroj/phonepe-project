package com.phonepe.controller;

import com.phonepe.entity.User;
import com.phonepe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ModelAndView loginUser(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Login success");
        return modelAndView;

    }
}
