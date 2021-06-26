package co.edu.poli.dao;

import org.springframework.data.repository.CrudRepository;
import co.edu.poli.entities.Usuario; 

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
}