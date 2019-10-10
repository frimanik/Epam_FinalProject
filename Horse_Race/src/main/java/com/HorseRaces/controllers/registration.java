package com.HorseRaces.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.HorseRaces.entity.User;
import com.HorseRaces.services.UserService;
import com.HorseRaces.services.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;


//@Slf4j
//@RestController
@Controller
public class registration {
    @Autowired
    private UserManager userManager;

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public ModelAndView registrationPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView registrationSet(User user) {
        ModelAndView modelAndView = new ModelAndView();
            userService.regUser(user);
        return modelAndView;
    }


}

