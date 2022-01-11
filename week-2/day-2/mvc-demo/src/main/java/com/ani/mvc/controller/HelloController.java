package com.ani.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/login")
    public String login() {
        // after doing processing here, view will be returned
        return "login";
    }
}
