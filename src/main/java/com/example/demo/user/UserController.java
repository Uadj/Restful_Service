package com.example.demo.user;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {
    private UserDaoService service;

    public UserController(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }
}
