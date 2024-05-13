package com.movies.projectmovies.rest;


import com.movies.projectmovies.model.User;
import com.movies.projectmovies.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserRest {

    @Autowired
    private UserService userService;

    @GetMapping
    private ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.findAll());
    }

    /* @GetMapping("/user/registration")
    public String showRegistrationForm(){
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    } */





}
