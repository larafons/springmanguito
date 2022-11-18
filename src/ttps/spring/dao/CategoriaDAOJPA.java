package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.Categoria;

@Component
public class CategoriaDAOJPA extends GenericDAOHibernateJPA<Categoria> implements CategoriaDAO{
	
	public CategoriaDAOJPA() {
		super(Categoria.class);
		
	}

}
