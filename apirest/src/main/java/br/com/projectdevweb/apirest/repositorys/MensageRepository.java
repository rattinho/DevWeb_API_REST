package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.Mensage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MensageRepository {
    @Lazy
    @Autowired
    private MR repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Mensage save(Mensage p) {
        return repository.save(p);
    }

    public List<Mensage> findByAtivity(int id) {
        return repository.findByToId(id);
    }

    public Mensage findById(int id) {
        try {
            return repository.findById(id).get();
        } catch (Exception e) {
            return new Mensage();
        }
    }

    public String remove(Mensage p) {
        // Verifica se o usuário já está cadastrado na atividade
        Mensage existingClasses = findById(p.getId());

        try {
            repository.delete(existingClasses);
            return "Removed!";
        } catch (Exception e) {
            return "Error:: /n" + e;
        }
    }
}