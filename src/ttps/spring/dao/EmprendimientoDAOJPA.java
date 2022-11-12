package ttps.spring.dao;

import ttps.spring.model.Emprendimiento;

public class EmprendimientoDAOJPA extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO{

	public EmprendimientoDAOJPA() {
		super(Emprendimiento.class);
		
	}

}
