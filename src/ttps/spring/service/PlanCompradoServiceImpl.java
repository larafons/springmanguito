package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.dao.PlanCompradoDAO;
import ttps.spring.model.PlanComprado;

@Service
public class PlanCompradoServiceImpl implements PlanCompradoService {
	
	@Qualifier("planCompradoDAOJPA")
	private PlanCompradoDAO planCompradoDAO;
	
	@Autowired
	public PlanCompradoServiceImpl(PlanCompradoDAO ad) {
		this.planCompradoDAO = ad;
	}
	
	public PlanCompradoServiceImpl() {
		
	}
	
	
	@Override
	public void actualizar(PlanComprado entity) {
		planCompradoDAO.actualizar(entity);
	}

	@Override
	public void borrar(PlanComprado entity) {
		planCompradoDAO.borrar(entity);
	}

	@Override
	public PlanComprado borrar(Serializable id) {
		return planCompradoDAO.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return planCompradoDAO.existe(id);
	}

	@Override
	public PlanComprado persistir(PlanComprado admin) {
		return planCompradoDAO.persistir(admin);
	}

	@Override
	public PlanComprado recuperar(Serializable id) {
		return planCompradoDAO.recuperar(id);
	}

	@Override
	public List<PlanComprado> recuperarTodos(String column) {
		List<PlanComprado> lista = planCompradoDAO.recuperarTodos(column);
		return lista;
	}

}
