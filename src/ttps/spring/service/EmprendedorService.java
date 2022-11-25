package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ttps.spring.model.Emprendedor;

public interface EmprendedorService {

	void actualizar(Emprendedor entity);

	void borrar(Emprendedor entity);

	Emprendedor borrar(Serializable id);

	Emprendedor persistir(Emprendedor entity);

	boolean existe(Serializable id);

	List<Emprendedor> recuperarTodos(String column);

	Emprendedor recuperar(Serializable id);
	
	Emprendedor recuperarByUser(String usuario);

}
