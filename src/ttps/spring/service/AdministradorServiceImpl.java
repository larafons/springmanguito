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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Administrador entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Administrador borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Administrador persistir(Administrador emprendedor) {
		// TODO Auto-generated method stub
		return administradorDAO.persistir(emprendedor);
	}

	@Override
	public Administrador recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Administrador> recuperarTodos(String column) {
		// TODO Auto-generated method stub
		List<Administrador> lista = administradorDAO.recuperarTodos(column);
		return lista;
	}

}
