package com.gilead.gtacs.controller;
import com.gilead.gtacs.model.User;
import com.gilead.gtacs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("gtacs")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("user")
    public ResponseEntity<List<User>> getUser() {
        List<User> users = userService.getAllUser();
        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("saveuser")
    public ResponseEntity<User> saveUser(@RequestBody User user) {

            User savedUser = userService.saveUser(user);
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    }