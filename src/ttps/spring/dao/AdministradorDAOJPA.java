package ttps.spring.dao;

import ttps.spring.model.Administrador;

public class AdministradorDAOJPA extends GenericDAOHibernateJPA<Administrador> implements AdministradorDAO{

	public AdministradorDAOJPA() {
		super(Administrador.class);

	}

}
