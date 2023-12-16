package br.com.projectdevweb.apirest.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projectdevweb.apirest.models.Class;
import java.util.List;


@Repository
public interface CR extends CrudRepository<Class, Integer> {
    List<Class> findByUsuarioId(int usuarioId);
    List<Class> findByAtividadeId(int atividadeId);
}
