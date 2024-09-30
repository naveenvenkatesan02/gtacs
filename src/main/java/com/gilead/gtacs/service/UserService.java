package com.gilead.gtacs.service;

import com.gilead.gtacs.model.User;
import com.gilead.gtacs.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

        public List<User> getAllUser(){
            return userRepo.findAll();
        }

        public User saveUser(User user){
            return userRepo.save(user);
        }
}
