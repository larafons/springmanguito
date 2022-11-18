package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.Posteo;

@Component
public class PosteoDAOJPA extends GenericDAOHibernateJPA<Posteo> implements PosteoDAO{
	
	public PosteoDAOJPA() {
		super(Posteo.class);
		
	}

}
