package ttps.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.dao.CategoriaDAO;
import ttps.spring.model.Categoria;


@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Qualifier("categoriaDAOJPA")
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	public CategoriaServiceImpl(CategoriaDAO cat) {
		this.categoriaDAO = cat;
	}
	
	public CategoriaServiceImpl() {
	}
	
	@Override
	public void actualizar(Categoria entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Categoria entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categoria borrar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Categoria persistir(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDAO.persistir(categoria);
	}

	@Override
	public Categoria recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> recuperarTodos(String column) {
		// TODO Auto-generated method stub
		List<Categoria> lista = categoriaDAO.recuperarTodos(column);
		return lista;
	}

}
