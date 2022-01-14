package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my")
public class FirstController {

    @GetMapping
    public ModelAndView data(Model model) {
        var mv = new ModelAndView();
        mv.setViewName("my");
        return mv;
    }
}
