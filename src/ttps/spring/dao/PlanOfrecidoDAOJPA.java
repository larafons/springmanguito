package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.PlanOfrecido;

@Component
public class PlanOfrecidoDAOJPA extends GenericDAOHibernateJPA<PlanOfrecido> implements PlanOfrecidoDAO{

	public PlanOfrecidoDAOJPA() {
		super(PlanOfrecido.class);
	}

}
