import entidades.Categoria;
import entidades.Emprendedor;
import entidades.Emprendimiento;
import entidades.Posteo;

public class ManguitoTestCreacion {

	public static void main(String[] args) {
		Emprendedor emprendedor = new Emprendedor("1234","Lara");
		EmprendedorDAO emprendedorDAO = new EmprendedorDAOJPA();
		emprendedorDAO.persistir(emprendedor);
		Emprendimiento emprendimiento = new Emprendimiento("manguito/lara",
							"cafecito para lara","Copate con un cafe",758.2,emprendedor);
		Categoria cat1 = new Categoria("Arte");
		Categoria cat2 = new Categoria("Entretenimiento");
		CategoriaDAO categoriaDAO = new CategoriaDAOJPA();
		PosteoDAO posteoDAO = new PosteoDAOJPA();
		cat1 = categoriaDAO.persistir(cat1);
		cat2 = categoriaDAO.persistir(cat2);
		EmprendimientoDAO emprendimientoDAO = new EmprendimientoDAOJPA();
		emprendimiento.agregarCategoria(cat2);
		emprendimiento.agregarCategoria(cat1);
		emprendimiento = emprendimientoDAO.persistir(emprendimiento);
		System.out.println("Creacion del emprendimiento");
		System.out.println(emprendimientoDAO.recuperarTodos("id"));
		System.out.println("Categorias disponibles");
		System.out.println(categoriaDAO.recuperarTodos("id"));
		System.out.println(posteoDAO.recuperarTodos("id"));

		emprendimiento.setNombre("Nuevo nombre");
		Posteo posteo = new Posteo("Hola que tal");
		emprendimiento.agregarPosteo(posteo);
		emprendimientoDAO.actualizar(emprendimiento);
		System.out.println("Actualizacion del emprendimiento");
		System.out.println(emprendimientoDAO.recuperarTodos("id"));
		System.out.println(posteoDAO.recuperarTodos("id"));

		//posteoDAO.borrar(posteo.getId()); acomodar
		System.out.println("Emprendimiento eliminado");
		System.out.println(emprendimientoDAO.recuperarTodos("id"));
		System.out.println("Categorias disponibles");
		System.out.println(categoriaDAO.recuperarTodos("id"));
		System.out.println(posteoDAO.recuperarTodos("id"));
		

	}

}
