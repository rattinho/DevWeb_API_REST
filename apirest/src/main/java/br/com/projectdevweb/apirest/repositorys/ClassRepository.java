package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.Class;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ClassRepository {
    @Lazy
    @Autowired
    private CR repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Class save(Class p) {
        // Verifica se o usuário já está cadastrado na atividade
        List<Class> existingClasses = findByUserAndAtivity(p.getUsuarioId(), p.getAtividadeId());

        if (!existingClasses.isEmpty()) {
            // O usuário já está cadastrado na atividade, não faz nada
            return existingClasses.get(0);
        }

        // O usuário não está cadastrado na atividade, então salva a instância de Clas
        try {
            return repository.save(p);
        } catch (Exception e) {
            return new Class();
        }

    }

    public Iterable<Class> findAll() {
        return repository.findAll();
    }

    public String remove(Class p) {
        // Verifica se o usuário já está cadastrado na atividade
        List<Class> existingClasses = findByUserAndAtivity(p.getUsuarioId(), p.getAtividadeId());

        if (!existingClasses.isEmpty()) {
            repository.delete(existingClasses.get(0));
            return "Removed!";
        }

        return "Favorite Not Found";

    }

    public List<Class> findByUserAndAtivity(int usuarioId, int atividadeId) {
        // Consulta JPQL para encontrar classes associadas a um usuário e uma atividade
        // específicos
        String jpql = "SELECT c FROM Class c WHERE c.usuarioId = :usuarioId AND c.atividadeId = :atividadeId";
        return entityManager.createQuery(jpql, Class.class)
                .setParameter("usuarioId", usuarioId)
                .setParameter("atividadeId", atividadeId)
                .getResultList();
    }

    public List<Class> findByUser(int id) {
        return repository.findByUsuarioId(id);
    }

    public List<Class> findByAtivity(int id) {
        return repository.findByAtividadeId(id);
    }
}