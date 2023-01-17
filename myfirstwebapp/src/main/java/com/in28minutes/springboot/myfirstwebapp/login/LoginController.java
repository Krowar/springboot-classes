package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthenticationController authenticationController;

    public LoginController(AuthenticationController authenticationController) {
        this.authenticationController = authenticationController;
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String login(ModelMap model){
        model.put("name", "Frenchie");
        return "welcome";
    }

}
