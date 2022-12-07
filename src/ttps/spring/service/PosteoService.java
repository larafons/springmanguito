package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import ttps.spring.model.Posteo;

public interface PosteoService {
	
	void actualizar(Posteo entity);

	void borrar(Posteo entity);

	Posteo borrar(Serializable id);

	Posteo persistir(Posteo entity);

	boolean existe(Serializable id);

	List<Posteo> recuperarTodos(String column);

	Posteo recuperar(Serializable id);

}
