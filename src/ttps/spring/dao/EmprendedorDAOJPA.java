package ttps.spring.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Emprendedor;

@Repository 
public class EmprendedorDAOJPA extends GenericDAOHibernateJPA<Emprendedor> implements EmprendedorDAO{

	public EmprendedorDAOJPA() {
		super(Emprendedor.class);
	}
	
	

}
