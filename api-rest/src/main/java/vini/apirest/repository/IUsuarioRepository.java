package vini.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import vini.apirest.model.UsuarioModel;

public interface IUsuarioRepository extends CrudRepository <UsuarioModel, Integer> {

}
