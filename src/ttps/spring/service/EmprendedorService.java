package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

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
