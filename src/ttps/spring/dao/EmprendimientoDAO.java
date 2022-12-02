package ttps.spring.dao;

import ttps.spring.model.Emprendimiento;


public interface EmprendimientoDAO extends GenericDAO<Emprendimiento> {
	
	public Emprendimiento findByURL(String URL);

}
