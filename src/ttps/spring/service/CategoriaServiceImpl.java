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
		this.categoriaDAO.actualizar(entity);
	}

	@Override
	public void borrar(Categoria entity) {
		this.categoriaDAO.borrar(entity);
	}

	@Override
	public Categoria borrar(Serializable id) {
		return this.categoriaDAO.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return this.categoriaDAO.existe(id);
	}

	@Override
	public Categoria persistir(Categoria categoria) {
		return categoriaDAO.persistir(categoria);
	}

	@Override
	public Categoria recuperar(Serializable id) {
		return this.recuperar(id);
	}

	@Override
	public List<Categoria> recuperarTodos(String column) {
		// TODO Auto-generated method stub
		List<Categoria> lista = categoriaDAO.recuperarTodos(column);
		return lista;
	}

}
