package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class EventRepository {
    @Lazy
    @Autowired
    private EvR repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Event save(Event p) {
        return repository.save(p);
    }

    public Iterable<Event> findAll(){
        return repository.findAll();
    }

    public Event findById(int id) {
        try {
            return repository.findById(id).get();
        } catch (Exception e) {
            return new Event();
        }
    }

    public String atualiza(Event a) {
        Event existingClasses = findById(a.getId());
        try {
            if (existingClasses != null) {
                repository.save(a);
            } else {
                throw new Exception("Event nao encontrada");
            }
            return "Atualizado!";
        } catch (Exception e) {
            return "Error: /n" + e;
        }
    }

    public String remove(Event p) {
        // Verifica se o usuário já está cadastrado na atividade
        Event existingClasses = findById(p.getId());

        try {
            repository.delete(existingClasses);
            return "Removed!";
        } catch (Exception e) {
            return "Error:: /n" + e;
        }
    }

    
}