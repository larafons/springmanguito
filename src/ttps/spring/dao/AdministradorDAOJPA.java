package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.Administrador;

@Component
public class AdministradorDAOJPA extends GenericDAOHibernateJPA<Administrador> implements AdministradorDAO{

	public AdministradorDAOJPA() {
		super(Administrador.class);

	}

}
