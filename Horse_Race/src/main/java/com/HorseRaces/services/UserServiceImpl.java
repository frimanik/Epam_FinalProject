package com.HorseRaces.services;

import com.HorseRaces.entity.User;
import com.HorseRaces.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManagerImpl userManagerImpl;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(Long id){
        return userRepository.get(id);
    }

    @Override
    public void regUser(User user){
        user.setPassword(hash(user.getPassword()));
        userRepository.create(user);
    }

    @Override
    public String hash(String password) {
        return password;
    }

    @Override
    public boolean authUser(String login,String password){
        User currentUser;

        try {
            currentUser = userRepository.get(login);
        }
        catch (Exception exc){
            return false;
        }
        if(checkPassword(currentUser, password)){
            userManagerImpl.setUser(currentUser);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean checkPassword(User user,String password){return user.getPassword().equals(hash(password));}

    @Override
    public boolean checkUnique(User user){
        try {
            userRepository.get(user.getLogin());
        }
        catch (Exception ex){
            return false;
        }
        return true;
    }
}

