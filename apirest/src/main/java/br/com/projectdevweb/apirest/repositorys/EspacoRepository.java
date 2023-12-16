package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class EspacoRepository {
    @Lazy
    @Autowired
    private EsR repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Espaco save(Espaco p) {
        return repository.save(p);
    }

    public Iterable<Espaco> findAll() {
        return repository.findAll();
    }

    public Espaco findById(int id) {
        try {
            return repository.findById(id).get();
        } catch (Exception e) {
            return new Espaco();
        }
    }

    public String atualiza(Espaco a) {
        Espaco existingClasses = findById(a.getId());
        try {
            if (existingClasses != null) {
                repository.save(a);
            } else {
                throw new Exception("Espaco nao encontrada");
            }
            return "Atualizado!";
        } catch (Exception e) {
            return "Error: /n" + e;
        }
    }

}