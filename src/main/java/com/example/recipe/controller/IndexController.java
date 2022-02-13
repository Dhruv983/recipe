package com.example.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"index.html","/",""})
    public String getIndexPage(Model model){
        return "index";
    }
}
