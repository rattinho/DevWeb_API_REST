package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.UserRepository;
import br.com.projectdevweb.apirest.models.User;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User save(@RequestBody User u) {
        return userRepository.save(u);
    }
}
