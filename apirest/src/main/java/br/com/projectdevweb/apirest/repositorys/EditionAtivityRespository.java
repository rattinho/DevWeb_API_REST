package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class EditionAtivityRespository {
    @Lazy
    @Autowired
    private EAR repository;

    @PersistenceContext
    private EntityManager entityManager;

    public EditionAtivity save(EditionAtivity p) {
        return repository.save(p);
    }

    public EditionAtivity findById(int id) {
        try {
            return repository.findById(id).get();
        } catch (Exception e) {
            return new EditionAtivity();
        }
    }

    public Iterable<EditionAtivity> findAll() {
        return repository.findAll();
    }

    public String atualiza(EditionAtivity a) {
        EditionAtivity existingClasses = findById(a.getEdicaoId());
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

    public String remove(EditionAtivity p) {
        EditionAtivity existingClasses = findById(p.getId());

        try {
            repository.delete(existingClasses);
            return "Removed!";
        } catch (Exception e) {
            return "Error:: /n" + e;
        }
    }
}