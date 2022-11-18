package ttps.spring.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ttps.spring.model.Emprendedor;

@Repository 
public class EmprendedorDAOJPA extends GenericDAOHibernateJPA<Emprendedor> implements EmprendedorDAO{

	public EmprendedorDAOJPA() {
		super(Emprendedor.class);
	}
	
	public Emprendedor findByUsuario(String usuario) {
		Query consulta = this.getEntityManager().createQuery("select e from Emprendedor e where e.usuario =?");
		consulta.setParameter(1, usuario);
		Emprendedor resultado = (Emprendedor)consulta.getSingleResult();
		return resultado;
	}

}
