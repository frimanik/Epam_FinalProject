package com.HorseRaces.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class Authentication {
@RequestMapping("/authentication")
public String Authentication(){
    return "authentication";
    }
}


//TODO: finish the authentication controller; finish the front for site; finish services.