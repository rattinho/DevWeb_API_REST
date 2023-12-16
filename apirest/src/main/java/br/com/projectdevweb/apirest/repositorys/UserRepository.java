package br.com.projectdevweb.apirest.repositorys;

import br.com.projectdevweb.apirest.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepository {
    @Lazy
    @Autowired
    private UR repository;

    @PersistenceContext
    private EntityManager entityManager;


    public User save(User p) {
        return repository.save(p);
    }

    public User findById(int id) {
        try{
            return repository.findById(id).get();
        }catch(Exception e){
            return new User();
        }
    }
}