package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class EditionRepository {
    @Lazy
    @Autowired
    private EdR repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Edition save(Edition p) {
        return repository.save(p);
    }

    public Edition findById(int id) {
        try {
            return repository.findById(id).get();
        } catch (Exception e) {
            return new Edition();
        }
    }

    public Iterable<Edition> findAll() {
        return repository.findAll();
    }

    public String atualiza(Edition a) {
        Edition existingClasses = findById(a.getId());
        try {
            if (existingClasses != null) {
                repository.save(a);
            } else {
                throw new Exception("Ativity nao encontrada");
            }
            return "Atualizado!";
        } catch (Exception e) {
            return "Error: /n" + e;
        }
    }

    public String remove(Edition p) {
        // Verifica se o usuário já está cadastrado na atividade
        Edition existingClasses = findById(p.getId());

        try {
            repository.delete(existingClasses);
            return "Removed!";
        } catch (Exception e) {
            return "Error:: /n" + e;
        }
    }
}