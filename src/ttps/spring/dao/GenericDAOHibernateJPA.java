package ttps.spring.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GenericDAOHibernateJPA<T> implements GenericDAO<T>{
	private EntityManager entityManager;
	protected Class<T> persistentClass;

	public GenericDAOHibernateJPA(Class<T> clase) {
		this.persistentClass = clase;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	 @PersistenceContext
	 public void setEntityManager(EntityManager em){
		 this.entityManager = em;
	 }
	 public EntityManager getEntityManager() {
		 return entityManager;
	 }


	@Override
	public void borrar(Object entity) {
		 EntityManager em = getEntityManager();
		 em.remove(em.merge(entity));
	}

	@Override
	public T borrar(Serializable id) {
		 EntityManager em = getEntityManager();
		 T entity=em.find(this.getPersistentClass(), id);
		 if (entity != null) {
		 em.remove(entity);
		 }
		 return entity;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T persistir(T entity) {
		 /*EntityManager em = EMF.getEMF().createEntityManager();
		 EntityTransaction tx = null;
		 try {
		 tx = em.getTransaction();
		 tx.begin();
		 em.persist(entity);
		 tx.commit();
		 }
		 catch (RuntimeException e) {
		 if ( tx != null && tx.isActive() ) tx.rollback();
		 throw e; // escribir en un log o mostrar un mensaje
		 }
		 finally {
		 em.close();
		 }
		 ESTO NO IRIA MAS? */
		 this.getEntityManager().persist(entity);
		 return entity;
	}

	@Override
	public T recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> recuperarTodos(String column) {
		Query consulta=
				getEntityManager().createQuery("select e from "+ getPersistentClass().
						 getSimpleName()+" e");
				 List<T> resultado = (List<T>)consulta.getResultList();
				 return resultado;
	}

	@Override
	public void actualizar(T entity) {
		EntityManager em= getEntityManager();
		 T e = em.merge(entity);
	}

}
