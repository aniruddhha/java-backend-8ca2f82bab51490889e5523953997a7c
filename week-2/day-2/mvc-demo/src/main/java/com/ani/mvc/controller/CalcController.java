package com.ani.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc")
public class CalcController {

    // http resource can be anything which is accessible by url

    // hey spring get me the resource whose url belongs to /
    @GetMapping("/") // http method get
    public String home(Model model) {
        model.addAttribute("postData", new PostData());
        return "home";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute PostData postData, BindingResult err, Model model) {
        model.addAttribute("result", postData);
        return "result";
    }
}
