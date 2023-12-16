package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.UserRepository;
import br.com.projectdevweb.apirest.models.User;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/usuarios")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    //Sign in User
    @PostMapping("/cadastrar")
    public User save(@RequestBody User u) {
        return userRepository.save(u);
    }

    //Get Information for 1 User
    @GetMapping("/{id}")
    public User searchUser(@PathVariable int id) {
        return userRepository.findById(id);
    }

    
    
}
