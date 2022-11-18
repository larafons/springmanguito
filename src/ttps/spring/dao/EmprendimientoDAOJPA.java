package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.Emprendimiento;

@Component
public class EmprendimientoDAOJPA extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO{

	public EmprendimientoDAOJPA() {
		super(Emprendimiento.class);
		
	}

}
