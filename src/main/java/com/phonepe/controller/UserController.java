package com.phonepe.controller;

import com.phonepe.dao.UserRepository;
import com.phonepe.entity.User;
import com.phonepe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    

    @PostMapping("/login")
    public String loginUser(User user) {
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Login success");

        List<User> find = userRepository.findAll();

        for (User users : find) {
            if (user.getMobileNumber() == users.getMobileNumber() && user.getPassword().equals(users.getPassword())) {
                return "welcome";
            }
        }
        System.out.println("MobileNumber & PassWord Wrong .....");
        return "index";
    }
}
