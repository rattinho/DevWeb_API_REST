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

    //Cadastrar Edição
    @PostMapping("/cadastrar")
    public Edition save(@RequestBody Edition u) {
        return editionRepository.save(u);
    }

    //Vizualisar todas as Edições
    @GetMapping("/all")
    public Iterable<Edition> searchAll() {
        return editionRepository.findAll();
    }

    //Obter informações de uma determinada Edição
    @GetMapping("/{id}")
    public Edition searchEspaco(@PathVariable int id) {
        return editionRepository.findById(id);
    }

    //Atualizar informações de uma Edição
    @PutMapping("/atualiza")
    public String atualiza(@RequestBody Edition a) {
        return editionRepository.atualiza(a);
    }

    //Remover uma Edição
    @DeleteMapping("/remove")
    public String remove(@RequestBody Edition a) {
        return editionRepository.remove(a);
    }

}
