package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ttps.spring.model.Emprendimiento;

public interface EmprendimientoService {

	void actualizar(Emprendimiento entity);

	void borrar(Emprendimiento entity);

	Emprendimiento borrar(Serializable id);

	Emprendimiento persistir(Emprendimiento entity);

	boolean existe(Serializable id);

	List<Emprendimiento> recuperarTodos(String column);

	Emprendimiento recuperar(Serializable id);
	 

}