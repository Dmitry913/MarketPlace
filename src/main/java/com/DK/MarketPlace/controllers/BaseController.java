package com.DK.MarketPlace.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class BaseController {

    @GetMapping("/greeting")
    public String hello(@RequestParam(defaultValue = "World") String name,
                        Map<String, Object> model) {
        model.put("name", name);

        return "greeting";
    }

    @GetMapping
    public String mainPage(Map<String, Object> model) {
        model.put("message", "Today i start project");

        return "startpage";
    }
}
