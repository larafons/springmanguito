package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.dao.AdministradorDAO;
import ttps.spring.model.Administrador;

@Service
public class AdministradorServiceImpl implements AdministradorService{
	
	@Qualifier("administradorDAOJPA")
	private AdministradorDAO administradorDAO;
	
	@Autowired
	public AdministradorServiceImpl(AdministradorDAO ad) {
		this.administradorDAO = ad;
	}
	
	public AdministradorServiceImpl() {
		
	}
	
	
	@Override
	public void actualizar(Administrador entity) {
		administradorDAO.actualizar(entity);
	}

	@Override
	public void borrar(Administrador entity) {
		administradorDAO.borrar(entity);
	}

	@Override
	public Administrador borrar(Serializable id) {
		return administradorDAO.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return administradorDAO.existe(id);
	}

	@Override
	public Administrador persistir(Administrador admin) {
		return administradorDAO.persistir(admin);
	}

	@Override
	public Administrador recuperar(Serializable id) {
		return administradorDAO.recuperar(id);
	}

	@Override
	public List<Administrador> recuperarTodos(String column) {
		List<Administrador> lista = administradorDAO.recuperarTodos(column);
		return lista;
	}

}
