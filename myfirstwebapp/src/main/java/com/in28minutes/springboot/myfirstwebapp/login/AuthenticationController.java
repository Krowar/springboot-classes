package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationController {

    public boolean checkAuthentication(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("gerald");
        boolean isValidPassword = password.equalsIgnoreCase("booboo");

        return isValidPassword && isValidPassword;

    }
}
