package com.alexesmet.example.bike.bikeweekend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RootController {

    @RequestMapping("/")
    public String root(Model model) {
        return "index";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        return "register";
    }
}
