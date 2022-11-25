package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import ttps.spring.model.PlanOfrecido;


public interface PlanOfrecidoService {
	
	void actualizar(PlanOfrecido entity);

	void borrar(PlanOfrecido entity);

	PlanOfrecido borrar(Serializable id);

	PlanOfrecido persistir(PlanOfrecido entity);

	boolean existe(Serializable id);

	List<PlanOfrecido> recuperarTodos(String column);

	PlanOfrecido recuperar(Serializable id);

}
