package br.com.projectdevweb.apirest.controller;

import br.com.projectdevweb.apirest.repositorys.EventRepository;
import br.com.projectdevweb.apirest.models.Event;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/evento")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    //Cadastrar Evento
    @PostMapping("/cadastrar")
    public Event save(@RequestBody Event u) {
        return eventRepository.save(u);
    }

    //Vizualisar todos os Eventos
    @GetMapping("/all")
    public Iterable<Event> searchAll() {
        return eventRepository.findAll();
    }

    //Vizualisar um Evento especifico
    @GetMapping("/{id}")
    public Event searchEspaco(@PathVariable int id) {
        return eventRepository.findById(id);
    }

    //Atualizar informações de um Evento
    @PutMapping("/atualiza")
    public String atualiza(@RequestBody Event a) {
        return eventRepository.atualiza(a);
    }

    //Remover um Evento
    @DeleteMapping("/remove")
    public String remove(@RequestBody Event a) {
        return eventRepository.remove(a);
    }
}
