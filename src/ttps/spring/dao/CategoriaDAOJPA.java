package ttps.spring.dao;

import ttps.spring.model.Categoria;

public class CategoriaDAOJPA extends GenericDAOHibernateJPA<Categoria> implements CategoriaDAO{
	
	public CategoriaDAOJPA() {
		super(Categoria.class);
		
	}

}
