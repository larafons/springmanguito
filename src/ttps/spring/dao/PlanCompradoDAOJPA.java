package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.PlanComprado;

@Component
public class PlanCompradoDAOJPA extends GenericDAOHibernateJPA<PlanComprado> implements PlanCompradoDAO{

	public PlanCompradoDAOJPA() {
		super(PlanComprado.class);
		
	}

}

