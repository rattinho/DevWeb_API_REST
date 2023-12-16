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

    //Cadastrar um Espaço
    @PostMapping("/cadastrar")
    public Espaco save(@RequestBody Espaco u) {
        return espacoRepository.save(u);
    }

    //Vizualizar todos os Espaços
    @GetMapping("/all")
    public Iterable<Espaco> searchAll() {
        return espacoRepository.findAll();
    }

    //Vizualisar um Espaço especifico
    @GetMapping("/{id}")
    public Espaco searchEspaco(@PathVariable int id) {
        return espacoRepository.findById(id);
    }

    //Atualizar informações de um determinado Espaço
    @PutMapping("/atualiza")
    public String atualiza(@RequestBody Espaco a) {
        return espacoRepository.atualiza(a);
    }
}
