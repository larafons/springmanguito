package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.dao.PosteoDAO;
import ttps.spring.model.Posteo;

@Service
public class PosteoServiceImpl implements PosteoService {
	@Qualifier("posteoDAOJPA")
	private PosteoDAO posteoDAO;
	
	@Autowired
	public PosteoServiceImpl(PosteoDAO pos) {
		this.posteoDAO = pos;
	}
	
	public PosteoServiceImpl() {
		
	}
	
	@Override
	public void actualizar(Posteo entity) {
		this.posteoDAO.actualizar(entity);
	}

	@Override
	public void borrar(Posteo entity) {
		this.posteoDAO.borrar(entity);
	}

	@Override
	public Posteo borrar(Serializable id) {
		return this.posteoDAO.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return this.posteoDAO.existe(id);
	}

	@Override
	public Posteo persistir(Posteo posteo) {
		return posteoDAO.persistir(posteo);
	}

	@Override
	public Posteo recuperar(Serializable id) {
		return this.posteoDAO.recuperar(id);
	}

	@Override
	public List<Posteo> recuperarTodos(String column) {
		List<Posteo> lista = posteoDAO.recuperarTodos(column);
		return lista;
	}

}
