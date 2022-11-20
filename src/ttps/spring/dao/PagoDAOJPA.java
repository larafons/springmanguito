package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.Pago;

@Component
public class PagoDAOJPA extends GenericDAOHibernateJPA<Pago> implements PagoDAO{

	public PagoDAOJPA() {
		super(Pago.class);
	}

}
