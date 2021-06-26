package co.edu.poli.implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.poli.dao.IUsuarioDao;
import co.edu.poli.entities.Usuario;
import co.edu.poli.services.IUsuarioServices;
@Service
public class ClienteServices implements IUsuarioServices{
@Autowired
private IUsuarioDao clienteDao;
@Transactional(readOnly = true)
public List<Usuario> findAll() {
	return (List<Usuario>) clienteDao.findAll();
}
@Transactional(readOnly = false)
	public Usuario create(@RequestBody Usuario usuario){
	System.out.println(usuario.getDependencia());
	return clienteDao.save(usuario);
	}
}
