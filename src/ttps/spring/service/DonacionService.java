package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import ttps.spring.model.Donacion;


public interface DonacionService {
	
	void actualizar(Donacion entity);

	void borrar(Donacion entity);

	Donacion borrar(Serializable id);

	Donacion persistir(Donacion entity);

	boolean existe(Serializable id);

	List<Donacion> recuperarTodos(String column);

	Donacion recuperar(Serializable id);


}
