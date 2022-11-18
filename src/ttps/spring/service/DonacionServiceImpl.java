package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.dao.DonacionDAO;
import ttps.spring.model.Donacion;

@Service
public class DonacionServiceImpl implements DonacionService{

	@Qualifier("donacionDAOJPA")
	private DonacionDAO donacionDAO;
	
	@Autowired
	public DonacionServiceImpl(DonacionDAO don) {
		this.donacionDAO = don;
	}
	public DonacionServiceImpl() {
		
	}
	
	@Override
	public void actualizar(Donacion entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Donacion entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Donacion borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Donacion persistir(Donacion emprendedor) {
		// TODO Auto-generated method stub
		return donacionDAO.persistir(emprendedor);
	}

	@Override
	public Donacion recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Donacion> recuperarTodos(String column) {
		// TODO Auto-generated method stub
		List<Donacion> lista = donacionDAO.recuperarTodos(column);
		return lista;
	}

}
