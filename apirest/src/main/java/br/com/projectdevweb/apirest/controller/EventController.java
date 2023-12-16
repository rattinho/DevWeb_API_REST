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

    // Sign in User
    @PostMapping("/cadastrar")
    public Event save(@RequestBody Event u) {
        return eventRepository.save(u);
    }

    // Get all Events
    @GetMapping("/all")
    public Iterable<Event> searchAll() {
        return eventRepository.findAll();
    }

    // Get Information for 1 Espaco
    @GetMapping("/{id}")
    public Event searchEspaco(@PathVariable int id) {
        return eventRepository.findById(id);
    }

    @PutMapping("/atualiza")
    public String atualiza(@RequestBody Event a) {
        return eventRepository.atualiza(a);
    }

    @DeleteMapping("/remove")
    public String remove(@RequestBody Event a) {
        return eventRepository.remove(a);
    }
}
