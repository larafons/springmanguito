package ttps.spring.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ttps.spring.model.Emprendedor;

@Repository 
public class EmprendedorDAOJPA extends GenericDAOHibernateJPA<Emprendedor> implements EmprendedorDAO{

	public EmprendedorDAOJPA() {
		super(Emprendedor.class);
	}
	
	public Emprendedor findByUsuario(String usuario) {
		Emprendedor resultado;
		Query consulta = this.getEntityManager().createQuery("select e from Emprendedor e where e.usuario =?1");
		consulta.setParameter(1, usuario);
		try {
			resultado = (Emprendedor)consulta.getSingleResult();
		} catch (NoResultException e){
			resultado = null;
		}
		return resultado;
	}

}
