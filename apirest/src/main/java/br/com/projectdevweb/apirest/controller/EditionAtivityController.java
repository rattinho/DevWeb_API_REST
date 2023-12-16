package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.EditionAtivityRespository;
import br.com.projectdevweb.apirest.models.EditionAtivity;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/edicao/atv")
public class EditionAtivityController {

    @Autowired
    private EditionAtivityRespository eAtivityRespository;

    //Criar relação entre Edição e Atividade
    @PostMapping("/cadastrar")
    public EditionAtivity save(@RequestBody EditionAtivity u) {
        return eAtivityRespository.save(u);
    }

    //Vizualisar relações entre Edições e Atividades
    @GetMapping("/all")
    public Iterable<EditionAtivity> searchAll() {
        return eAtivityRespository.findAll();
    }

    //Obter Informações de uma determinada relação
    @GetMapping("/{id}")
    public EditionAtivity searchEditionAtivity(@PathVariable int id) {
        return eAtivityRespository.findById(id);
    }

    //Atualizar uma relação entre Edição e Atividade
    @PutMapping("/atualiza")
    public String atualiza(@RequestBody EditionAtivity a) {
        return eAtivityRespository.atualiza(a);
    }

    //Remover relação entre Edição e Atividade
    @DeleteMapping("/remove")
    public String remove(@RequestBody EditionAtivity a) {
        return eAtivityRespository.remove(a);
    }
}