package com.springexample.springdemo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
public class MyWebController {

    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("Saying hello world Spring boot...");
        model.addAttribute("message", "greetings!..");
        return "hello";
    }

}
