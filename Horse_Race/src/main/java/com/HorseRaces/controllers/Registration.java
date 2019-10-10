package com.HorseRaces.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.HorseRaces.repository.UserRepository;

@Controller
public class Registration {
    @RequestMapping("/registration")
    public String Home(){
        return "registration";
    }


}

