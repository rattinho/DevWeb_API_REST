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

    // Sign in User
    @PostMapping("/cadastrar")
    public Mensage save(@RequestBody Mensage u) {
        return mensageRepository.save(u);
    }

    // Get Mensagem for one ativity
    @GetMapping("/{id}")
    public List<Mensage> searchMAtivty(@PathVariable int id) {
        return mensageRepository.findByAtivity(id);
    }

    @DeleteMapping("/remove")
    public String remove(@RequestBody Mensage a) {
        return mensageRepository.remove(a);
    }

}
