package ttps.spring.dao;

import ttps.spring.model.Administrador;


public interface AdministradorDAO extends GenericDAO<Administrador>{
	
	public Administrador findByUsuario(String usuario);
}
