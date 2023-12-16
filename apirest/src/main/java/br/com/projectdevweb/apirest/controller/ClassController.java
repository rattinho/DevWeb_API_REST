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

    //Favoritar/Inscrever-se em uma Atividade
    @PostMapping("/cadastrar")
    public Class save(@RequestBody Class u) {
        return classRepository.save(u);
    }

    //Vizualisar relação entre usuários e Atividades
    @GetMapping("/all")
    public Iterable<Class> searchAll() {
        return classRepository.findAll();
    }

    //Vizualisar relação entre usuários e uma determinada Atividade
    @GetMapping("/atv/{id}")
    public List<Class> searchAtivty(@PathVariable int id) {
        return classRepository.findByAtivity(id);
    }

    //Remover relação entre usuário e Atividade
    @DeleteMapping("/remover")
    public String remove(@RequestBody Class u) {
        return classRepository.remove(u);
    }
}
