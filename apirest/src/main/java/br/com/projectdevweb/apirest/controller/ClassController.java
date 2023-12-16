package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.ClassRepository;
import br.com.projectdevweb.apirest.models.Class;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/favoritos")
public class ClassController {

    @Autowired
    private ClassRepository classRepository;

    // Favorite a Ativity
    @PostMapping("/cadastrar")
    public Class save(@RequestBody Class u) {
        return classRepository.save(u);
    }

    // Get all vinculos entre alunos e atividade
    @GetMapping("/all")
    public Iterable<Class> searchAll() {
        return classRepository.findAll();
    }

    // Get all vinculos de uma atividade
    @GetMapping("/atv/{id}")
    public List<Class> searchMAtivty(@PathVariable int id) {
        return classRepository.findByAtivity(id);
    }

    @DeleteMapping("/remover")
    public String remove(@RequestBody Class u) {
        return classRepository.remove(u);
    }
}
