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
		this.donacionDAO.actualizar(entity);
		
	}

	@Override
	public void borrar(Donacion entity) {
		this.borrar(entity);
	}

	@Override
	public Donacion borrar(Serializable id) {
		return this.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return this.donacionDAO.existe(id);
	}

	@Override
	public Donacion persistir(Donacion donacion) {
		return donacionDAO.persistir(donacion);
	}

	@Override
	public Donacion recuperar(Serializable id) {
		return this.donacionDAO.recuperar(id);
	}

	@Override
	public List<Donacion> recuperarTodos(String column) {
		List<Donacion> lista = donacionDAO.recuperarTodos(column);
		return lista;
	}

}