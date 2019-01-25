package com.shashank.sprinboot.springbootwebtestexample.controller;

import com.shashank.sprinboot.springbootwebtestexample.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

   @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return greetingService.greet();
    }

}
