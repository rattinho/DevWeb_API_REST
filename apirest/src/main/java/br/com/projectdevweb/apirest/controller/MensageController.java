package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.MensageRepository;
import br.com.projectdevweb.apirest.models.Mensage;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/mensagem")
public class MensageController {

    @Autowired
    private MensageRepository mensageRepository;

    //Cadastrar Mensagem
    @PostMapping("/cadastrar")
    public Mensage save(@RequestBody Mensage u) {
        return mensageRepository.save(u);
    }

    //Vizualisar mensagens de uma determinada Atividade
    @GetMapping("/{id}")
    public List<Mensage> searchMAtivty(@PathVariable int id) {
        return mensageRepository.findByAtivity(id);
    }

    //Deletar mensagens
    @DeleteMapping("/remove")
    public String remove(@RequestBody Mensage a) {
        return mensageRepository.remove(a);
    }

}
