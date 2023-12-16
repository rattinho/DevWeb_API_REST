package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.EspacoRepository;
import br.com.projectdevweb.apirest.models.Espaco;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/espaco")
public class EspacoController {

    @Autowired
    private EspacoRepository espacoRepository;

    // Sign in User
    @PostMapping("/cadastrar")
    public Espaco save(@RequestBody Espaco u) {
        return espacoRepository.save(u);
    }

    // Get all spaces
    @GetMapping("/all")
    public Iterable<Espaco> searchAll() {
        return espacoRepository.findAll();
    }

    // Get Information for 1 Espaco
    @GetMapping("/{id}")
    public Espaco searchEspaco(@PathVariable int id) {
        return espacoRepository.findById(id);
    }

    @PutMapping("/atualiza")
    public String atualiza(@RequestBody Espaco a) {
        return espacoRepository.atualiza(a);
    }
}
