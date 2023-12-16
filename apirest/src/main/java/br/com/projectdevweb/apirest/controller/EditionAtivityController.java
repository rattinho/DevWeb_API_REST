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

    // Sign in User
    @PostMapping("/cadastrar")
    public EditionAtivity save(@RequestBody EditionAtivity u) {
        return eAtivityRespository.save(u);
    }

    // Get all vinculos entre edicao e atividade
    @GetMapping("/all")
    public Iterable<EditionAtivity> searchAll() {
        return eAtivityRespository.findAll();
    }

    // Get Information for 1 edicao
    @GetMapping("/{id}")
    public EditionAtivity searchEspaco(@PathVariable int id) {
        return eAtivityRespository.findById(id);
    }

    @PutMapping("/atualiza")
    public String atualiza(@RequestBody EditionAtivity a) {
        return eAtivityRespository.atualiza(a);
    }

    @DeleteMapping("/remove")
    public String remove(@RequestBody EditionAtivity a) {
        return eAtivityRespository.remove(a);
    }
}