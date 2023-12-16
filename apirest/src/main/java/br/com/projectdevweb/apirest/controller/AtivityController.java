package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.AtivityRepository;
import br.com.projectdevweb.apirest.models.Ativity;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/atividade")
public class AtivityController {
    @Autowired
    private AtivityRepository ativityRepository;

    // Vizualize Ativity
    @GetMapping("/{id}")
    public Ativity searchAtivity(@PathVariable int id) {
        return ativityRepository.findById(id);
    }

    // Cadastra Atividade
    @PostMapping("/cadastrar")
    public Ativity save(@RequestBody Ativity a) {
        return ativityRepository.save(a);
    }

    
    // Get all Ativitys
    @GetMapping("/all")
    public Iterable<Ativity> searchAll() {
        return ativityRepository.findAll();
    }

    // Deleta Atividade
    @DeleteMapping("/remove")
    public String remove(@RequestBody Ativity a) {
        return ativityRepository.remove(a);
    }

    // Atualiza Atividade
    @PutMapping("/atualiza")
    public String atualiza(@RequestBody Ativity a) {
        return ativityRepository.atualiza(a);
    }
}
