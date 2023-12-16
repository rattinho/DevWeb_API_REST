package br.com.projectdevweb.apirest.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projectdevweb.apirest.models.Mensage;
import java.util.List;


@Repository
public interface MR extends CrudRepository<Mensage, Integer>{
    List<Mensage> findByToId(int toId);
}