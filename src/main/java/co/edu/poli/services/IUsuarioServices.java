package co.edu.poli.services;

import java.util.List;
import co.edu.poli.entities.Usuario;

public interface IUsuarioServices {
	public List<Usuario> findAll();
	public Usuario create(Usuario usuario);
}
