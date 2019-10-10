package com.HorseRaces.controllers;

import com.HorseRaces.entity.User;
import com.HorseRaces.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class home {
    @Autowired
    private UserRepository userRepository;

@RequestMapping("/home")

public String Home()
    {
    return "home";
    }

}
