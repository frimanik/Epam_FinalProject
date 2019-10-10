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
public class Home {
    @Autowired
    private UserRepository userRepository;

@RequestMapping("/")

public String Home()
{
    userRepository.update(new User(1L,"Joja","JoJo","ZaWarudo!",100000,"admin"));
    return "home";
}
}
