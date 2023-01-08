package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class SayHelloController {


    @RequestMapping("say-hello-jsp")
    public String sayHelloJspwithparam(@RequestParam String name, ModelMap model) {
        if (name == "") {
            name = "Frenchie";
        }
        model.put("name", name);
        return "sayHello";
    }
}
