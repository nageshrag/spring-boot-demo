package com.dailycodebuffer.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller
// @ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!!";
    }
}
