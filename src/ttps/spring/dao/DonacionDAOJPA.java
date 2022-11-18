package ttps.spring.dao;

import ttps.spring.model.Donacion;

public class DonacionDAOJPA extends GenericDAOHibernateJPA<Donacion> implements DonacionDAO{

	public DonacionDAOJPA() {
		super(Donacion.class);
	}

}
