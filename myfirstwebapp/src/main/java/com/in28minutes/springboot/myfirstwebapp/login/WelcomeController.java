package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    private AuthenticationController authenticationController;

    public WelcomeController(AuthenticationController authenticationController) {
        this.authenticationController = authenticationController;
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String goToWelcomePage(ModelMap model){
        model.put("name", getLoggedinUsename());
        return "welcome";
    }

    private String getLoggedinUsename(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

}
