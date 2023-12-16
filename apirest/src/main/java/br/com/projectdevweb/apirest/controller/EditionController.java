package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.EditionRepository;
import br.com.projectdevweb.apirest.models.Edition;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/edicao")
public class EditionController {

    @Autowired
    private EditionRepository editionRepository;

    // Sign in User
    @PostMapping("/cadastrar")
    public Edition save(@RequestBody Edition u) {
        return editionRepository.save(u);
    }

    // Get all Editions
    @GetMapping("/all")
    public Iterable<Edition> searchAll() {
        return editionRepository.findAll();
    }

    // Get Information for 1 Edicao
    @GetMapping("/{id}")
    public Edition searchEspaco(@PathVariable int id) {
        return editionRepository.findById(id);
    }

    @PutMapping("/atualiza")
    public String atualiza(@RequestBody Edition a) {
        return editionRepository.atualiza(a);
    }

    @DeleteMapping("/remove")
    public String remove(@RequestBody Edition a) {
        return editionRepository.remove(a);
    }

}
