package ttps.spring.dao;

import org.springframework.stereotype.Component;

import ttps.spring.model.Emprendimiento;


public interface EmprendimientoDAO extends GenericDAO<Emprendimiento> {
	
	public Emprendimiento findByURL(String URL);

}
