package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ttps.spring.dao.EmprendimientoDAO;
import ttps.spring.model.Emprendimiento;

@Service
public class EmprendimientoServiceImpl implements EmprendimientoService {

	@Qualifier("emprendimientoDAOJPA")
	private EmprendimientoDAO emprendimientoDAO;
	
	@Autowired
	public EmprendimientoServiceImpl(EmprendimientoDAO emp) {
		this.emprendimientoDAO = emp;
	}
	
	@Override
	public void actualizar(Emprendimiento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Emprendimiento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Emprendimiento borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Emprendimiento persistir(Emprendimiento emprendedor) {
		// TODO Auto-generated method stub
		return emprendimientoDAO.persistir(emprendedor);
	}

	@Override
	public Emprendimiento recuperar(Serializable id) {
		return emprendimientoDAO.recuperar(id);
	}

	@Override
	public List<Emprendimiento> recuperarTodos(String column) {
		// TODO Auto-generated method stub
		List<Emprendimiento> lista = emprendimientoDAO.recuperarTodos(column);
		return lista;
	}

}