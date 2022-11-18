package ttps.spring.dao;

import ttps.spring.model.PlanOfrecido;

public class PlanOfrecidoDAOJPA extends GenericDAOHibernateJPA<PlanOfrecido> implements PlanOfrecidoDAO{

	public PlanOfrecidoDAOJPA() {
		super(PlanOfrecido.class);
	}

}
