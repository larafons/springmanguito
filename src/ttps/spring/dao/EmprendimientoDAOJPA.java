package ttps.spring.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import ttps.spring.model.Emprendimiento;

@Component
public class EmprendimientoDAOJPA extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO{

	public EmprendimientoDAOJPA() {
		super(Emprendimiento.class);
		
	}
	
	public Emprendimiento findByURL(String URL) {
		Emprendimiento resultado;
		Query consulta = this.getEntityManager().createQuery("select e from Emprendimiento e where e.url =?1");
		consulta.setParameter(1, URL);
		try {
			resultado = (Emprendimiento)consulta.getSingleResult();
		} catch (NoResultException e){
			resultado = null;
		}
		return resultado;
	}

}
