package test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ttps.spring.dao.EmprendedorDAO;

public class TestSpringSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//registra una o más componentes que serán procesadas
		ctx.register(ttps.spring.config.PersistenceConfig.class);
		//Busca clases anotadas en el paquete base pasado por parámetro
		ctx.scan("ttps");
		ctx.refresh(); //aca se rompe porque no puede crear un bean entityManagerFactory (?)
		EmprendedorDAO usrDAO = ctx.getBean("emprendedorDAOImpl", EmprendedorDAO.class);
		System.out.println(usrDAO/*.listAll()*/);

	}

}
