package co.edu.poli.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.poli.entities.Usuario;
import co.edu.poli.services.IUsuarioServices;


@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	@Autowired
	private IUsuarioServices usuarioService;
	@GetMapping("/usuario")
	public List<Usuario> index(){
	return usuarioService.findAll();
	}
	@PostMapping("/usuario")
	public Usuario create(@RequestBody Usuario usuario){
	return usuarioService.create(usuario);
	}
}


/*

server.port=4200
spring.datasource.url=jdbc:mysql://localhost:3306/ejercicio_spring_bd
spring.datasource.username=ejercicio_spring_user
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/proyecto?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root


spring.jpa.show-sql=true
server.port=8081

spring.jpa.hibernate.ddl-auto=none

 
 */