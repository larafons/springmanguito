package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ttps.spring.dao.EmprendedorDAO;
import ttps.spring.model.Emprendedor;

@Service
public class EmprendedorServiceImpl implements EmprendedorService {

	@Qualifier("emprendedorDAOJPA")
	private EmprendedorDAO emprendedorDAO;
	
	@Autowired
	public EmprendedorServiceImpl(EmprendedorDAO emp) {
		this.emprendedorDAO = emp;
	}
	
	@Override
	public void actualizar(Emprendedor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Emprendedor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Emprendedor borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Emprendedor persistir(Emprendedor emprendedor) {
		// TODO Auto-generated method stub
		return emprendedorDAO.persistir(emprendedor);
	}

	@Override
	public Emprendedor recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emprendedor> recuperarTodos(String column) {
		// TODO Auto-generated method stub
		List<Emprendedor> lista = emprendedorDAO.recuperarTodos(column);
		return lista;
	}

}
