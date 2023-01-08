package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationController authenticationController;

    public LoginController(AuthenticationController authenticationController) {
        this.authenticationController = authenticationController;
    }

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(this.authenticationController.checkAuthentication(name,password)){
            model.put("name", name);
            return "welcome";
        }
        else{
            model.put("error", "Wrong username or password");
            return "login";
        }
    }
}
