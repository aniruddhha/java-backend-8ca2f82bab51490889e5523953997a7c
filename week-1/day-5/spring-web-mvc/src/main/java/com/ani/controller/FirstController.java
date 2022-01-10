package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FirstController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHi(Model model) {
        return "index";
    }
}
