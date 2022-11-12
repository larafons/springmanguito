package ttps.spring.dao;

import ttps.spring.model.Posteo;

public class PosteoDAOJPA extends GenericDAOHibernateJPA<Posteo> implements PosteoDAO{
	
	public PosteoDAOJPA() {
		super(Posteo.class);
		
	}

}
