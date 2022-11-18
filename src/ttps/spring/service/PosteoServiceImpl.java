package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ttps.spring.dao.PosteoDAO;
import ttps.spring.model.Posteo;


public class PosteoServiceImpl implements PosteoService {
	@Qualifier("posteoDAOJPA")
	private PosteoDAO posteoDAO;
	
	@Autowired
	public PosteoServiceImpl(PosteoDAO pos) {
		this.posteoDAO = pos;
	}
	
	@Override
	public void actualizar(Posteo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Posteo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Posteo borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Posteo persistir(Posteo posteo) {
		// TODO Auto-generated method stub
		return posteoDAO.persistir(posteo);
	}

	@Override
	public Posteo recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Posteo> recuperarTodos(String column) {
		// TODO Auto-generated method stub
		List<Posteo> lista = posteoDAO.recuperarTodos(column);
		return lista;
	}

}
