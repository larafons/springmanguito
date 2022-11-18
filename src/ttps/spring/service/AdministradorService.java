package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import ttps.spring.model.Administrador;


public interface AdministradorService {
	
	void actualizar(Administrador entity);

	void borrar(Administrador entity);

	Administrador borrar(Serializable id);

	Administrador persistir(Administrador entity);

	boolean existe(Serializable id);

	List<Administrador> recuperarTodos(String column);

	Administrador recuperar(Serializable id);

}
