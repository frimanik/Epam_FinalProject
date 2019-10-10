package com.HorseRaces.controllers;


import com.HorseRaces.entity.Bet;
import com.HorseRaces.entity.Horse;
import com.HorseRaces.entity.Race;
import com.HorseRaces.entity.User;
import com.HorseRaces.repository.BetRepository;
import com.HorseRaces.repository.HorseRepository;
import com.HorseRaces.repository.RaceRepository;
import com.HorseRaces.repository.UserRepository;
import com.HorseRaces.services.UserManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;




@Controller
public class Authentication {

    @Autowired
    private HorseRepository horseRepository;

@RequestMapping("/authentication")


public String Authentication(){


    horseRepository.create(new Horse(1L,"white"));
    horseRepository.update(new Horse(1L,"black"));
    horseRepository.get(1L);
    horseRepository.delete(1L);

    return "authentication";
    }
}


//TODO: finish the authentication controller; finish the front for site; finish services.