package br.com.projectdevweb.apirest.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projectdevweb.apirest.models.*;

@Repository
public interface EsR extends CrudRepository<Espaco, Integer>{
}