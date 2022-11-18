package ttps.spring.dao;

import ttps.spring.model.Emprendedor;

public interface EmprendedorDAO extends GenericDAO<Emprendedor> {
	
	public Emprendedor findByUsuario(String usuario);

}