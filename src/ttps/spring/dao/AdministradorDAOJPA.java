package ttps.spring.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import ttps.spring.model.Administrador;
import ttps.spring.model.Emprendedor;

@Component
public class AdministradorDAOJPA extends GenericDAOHibernateJPA<Administrador> implements AdministradorDAO{

	public AdministradorDAOJPA() {
		super(Administrador.class);

	}

	@Override
	public void borrar(Administrador entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Administrador findByUsuario(String usuario) {
		Administrador resultado;
		Query consulta = this.getEntityManager().createQuery("select e from Administrador e where e.usuario =?1");
		consulta.setParameter(1, usuario);
		try {
			resultado = (Administrador)consulta.getSingleResult();
		} catch (NoResultException e){
			resultado = null;
		}
		return resultado;
	}


}
