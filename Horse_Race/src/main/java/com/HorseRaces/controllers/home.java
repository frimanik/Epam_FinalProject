package com.HorseRaces.controllers;

import com.HorseRaces.entity.User;
import com.HorseRaces.repository.RaceRepository;
import com.HorseRaces.repository.UserRepository;
import com.HorseRaces.services.UserManager;
import com.HorseRaces.services.UserService;
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

    @Autowired
    private UserService userService;

    @Autowired
    private UserManager userManager;

    @Autowired
    private RaceRepository raceRepository;

@RequestMapping("/home")

public String Home()
    {
    return "home";
    }

}
