package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import ttps.spring.model.Donacion;
import ttps.spring.model.Emprendimiento;

public interface EmprendimientoService {

	void actualizar(Emprendimiento entity);

	void borrar(Emprendimiento entity);

	Emprendimiento borrar(Serializable id);

	Emprendimiento persistir(Emprendimiento entity);

	boolean existe(Serializable id);

	List<Emprendimiento> recuperarTodos(String column);

	Emprendimiento recuperar(Serializable id);
	 
	Donacion donar(Long id, Donacion donacion); // setear campos que no vienen en el parametro, por ejemplo: fecha (pedirle a java), precio del manguito (tomarlo el emprendimiento)

}