package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.Ativity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class AtivityRepository {
    @Lazy
    @Autowired
    private AR repository;

    @PersistenceContext
    private EntityManager entityManager;

    public String atualiza(Ativity a) {
        Ativity existingClasses = findById(a.getId());
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

    public Iterable<Ativity> findAll() {
        return repository.findAll();
    }

    public String remove(Ativity p) {
        // Verifica se o usuário já está cadastrado na atividade
        Ativity existingClasses = findById(p.getId());

        try {
            repository.delete(existingClasses);
            return "Removed!";
        } catch (Exception e) {
            return "Error:: /n" + e;
        }
    }

    public Ativity save(Ativity p) {
        return repository.save(p);
    }

    public Ativity findById(int id) {
        try {
            return repository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }
}