package com.yuanwhy.fantasy.controller;

import com.yuanwhy.fantasy.entity.User;
import com.yuanwhy.fantasy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView index(Integer id) {

        if (id == null) {
            id = 10;
        }

        User user =  userService.findUserById(id);

        ModelAndView modelAndView = new ModelAndView("/user/list");
        modelAndView.addObject("user", user);

        return modelAndView;
    }
}
