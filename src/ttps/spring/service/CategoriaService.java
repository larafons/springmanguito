package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import ttps.spring.model.Categoria;


public interface CategoriaService {
	
	void actualizar(Categoria entity);

	void borrar(Categoria entity);

	Categoria borrar(Serializable id);

	Categoria persistir(Categoria entity);

	boolean existe(Serializable id);

	List<Categoria> recuperarTodos(String column);

	Categoria recuperar(Serializable id);

}
