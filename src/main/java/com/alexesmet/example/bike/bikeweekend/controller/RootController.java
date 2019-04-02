package com.alexesmet.example.bike.bikeweekend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class RootController {

    @RequestMapping("/")
    public String root(Model model) {
        return "index";
    }

    @PostMapping("/register")
    public String register(@RequestParam("firstname") String firstname,
                           @RequestParam("surname") String surname,
                           @RequestParam("phone") String phone,
                           Model model) {

        return "register";
    }
}
