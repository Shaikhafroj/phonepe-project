package com.phonepe.controller;

import com.phonepe.entity.User;
import com.phonepe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/register")
    public ModelAndView registerUser(User user){
        userService.registerUser(user);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","User Registered Successfully");
        return modelAndView;
    }
}
