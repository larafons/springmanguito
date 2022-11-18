package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.Donacion;

@Component
public class DonacionDAOJPA extends GenericDAOHibernateJPA<Donacion> implements DonacionDAO{

	public DonacionDAOJPA() {
		super(Donacion.class);
	}

}
