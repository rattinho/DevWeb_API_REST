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

    @PostMapping("/cadastrar")
    public User save(@RequestBody User u) {
        return userRepository.save(u);
    }

    @GetMapping("/{id}/pagina")
    public User searchUser(@PathVariable int id) {
        return userRepository.findById(id);
    }
    
}
