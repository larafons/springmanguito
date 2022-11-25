package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.dao.PlanOfrecidoDAO;
import ttps.spring.model.PlanOfrecido;

@Service
public class PlanOfrecidoServiceImpl implements PlanOfrecidoService {
	
	@Qualifier("planCompradoDAOJPA")
	private PlanOfrecidoDAO planOfrecidoDAO;
	
	@Autowired
	public PlanOfrecidoServiceImpl(PlanOfrecidoDAO ad) {
		this.planOfrecidoDAO = ad;
	}
	
	public PlanOfrecidoServiceImpl() {
		
	}
	
	
	@Override
	public void actualizar(PlanOfrecido entity) {
		planOfrecidoDAO.actualizar(entity);
	}

	@Override
	public void borrar(PlanOfrecido entity) {
		planOfrecidoDAO.borrar(entity);
	}

	@Override
	public PlanOfrecido borrar(Serializable id) {
		return planOfrecidoDAO.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return planOfrecidoDAO.existe(id);
	}

	@Override
	public PlanOfrecido persistir(PlanOfrecido admin) {
		return planOfrecidoDAO.persistir(admin);
	}

	@Override
	public PlanOfrecido recuperar(Serializable id) {
		return planOfrecidoDAO.recuperar(id);
	}

	@Override
	public List<PlanOfrecido> recuperarTodos(String column) {
		List<PlanOfrecido> lista = planOfrecidoDAO.recuperarTodos(column);
		return lista;
	}

}