package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.UserRepository;
import br.com.projectdevweb.apirest.models.User;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Cadastrar novo Usuario
    @PostMapping("/cadastrar")
    public User save(@RequestBody User u) {
        return userRepository.save(u);
    }

    // Vizualisar informações de um determinado usuário
    @GetMapping("/{id}")
    public User searchUser(@PathVariable int id) {
        return userRepository.findById(id);
    }

    // Vizualisar todos os usuários
    @GetMapping("/all")
    public Iterable<User> searchAll() {
        return userRepository.findAll();
    }

}
