package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import ttps.spring.model.PlanComprado;


public interface PlanCompradoService {
	
	void actualizar(PlanComprado entity);

	void borrar(PlanComprado entity);

	PlanComprado borrar(Serializable id);

	PlanComprado persistir(PlanComprado entity);

	boolean existe(Serializable id);

	List<PlanComprado> recuperarTodos(String column);

	PlanComprado recuperar(Serializable id);

}
