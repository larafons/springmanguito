package ttps.spring.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Categoria {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categoria_id")
	private Long id;
	@Column
	private String nombre;

	
	public Categoria() {
		super();
	}


	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}


	public Categoria(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
