package ttps.spring.model;
import java.awt.Image;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Emprendimiento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emprendimiento_id")
	private Long id;
	@Column
	private String url;
	@Column
	private String nombre;
	@Column
	private String descripcion;
	@Column
	private String banner; //como se almacena en la bd??
	@Column
	private boolean visualizadorManguitos;
	@Column
	private boolean visualizarDonantes;
	@Column
	private double precioManguito;
	@OneToOne
	private Emprendedor emprendedor;
	
	/*@Column 
	private Set<String> redes;
	*/
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="emprendimiento")
	private Set<Posteo> posteo = new HashSet<Posteo>();
	
	@OneToMany (mappedBy="emprendimiento",cascade = CascadeType.ALL)
	private Set<PlanOfrecido> planesOfrecidos = new HashSet<PlanOfrecido>();
	
	@OneToMany (mappedBy="emprendimiento",cascade = CascadeType.ALL)
	private Set<Donacion> donaciones = new HashSet<Donacion>();
	
	@ManyToMany
	private Set<Categoria> categorias = new HashSet<Categoria>();
	
	public Emprendimiento (String url, String nombre, String descripcion, 
									double precioManguito, Emprendedor emprendedor) {
		this.url = url;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.emprendedor = emprendedor;
		
	}
	
	public Emprendimiento() {
		
	}
	
	@Override
	public String toString() {
		return "Emprendimiento [id=" + id + ", url=" + url + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", banner=" + banner + ", visualizadorManguitos=" + visualizadorManguitos + ", visualizarDonantes="
				+ visualizarDonantes + ", precioManguito=" + precioManguito + ", emprendedor=" + emprendedor
				+ ", posteo=" + posteo + ", planesOfrecidos=" + planesOfrecidos + ", donaciones=" + donaciones
				+ ", categorias=" + categorias + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public boolean isVisualizadorManguitos() {
		return visualizadorManguitos;
	}

	public void setVisualizadorManguitos(boolean visualizadorManguitos) {
		this.visualizadorManguitos = visualizadorManguitos;
	}

	public boolean isVisualizarDonantes() {
		return visualizarDonantes;
	}

	public void setVisualizarDonantes(boolean visualizarDonantes) {
		this.visualizarDonantes = visualizarDonantes;
	}

	public double getPrecioManguito() {
		return precioManguito;
	}

	public void setPrecioManguito(double precioManguito) {
		this.precioManguito = precioManguito;
	}

	public Emprendedor getEmprendedor() {
		return emprendedor;
	}

	public void setEmprendedor(Emprendedor emprendedor) {
		this.emprendedor = emprendedor;
	}
	/*
	public Set<String> getRedes() {
		return redes;
	}

	public void setRedes(Set<String> redes) {
		this.redes = redes;
	}
	*/
	public Set<Posteo> getPosteo() {
		return posteo;
	}

	public void setPosteo(Set<Posteo> posteo) {
		this.posteo = posteo;
	}

	public Set<PlanOfrecido> getPlanesOfrecidos() {
		return planesOfrecidos;
	}

	public void setPlanesOfrecidos(Set<PlanOfrecido> planesOfrecidos) {
		this.planesOfrecidos = planesOfrecidos;
	}

	public Set<Donacion> getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(Set<Donacion> donaciones) {
		this.donaciones = donaciones;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public void agregarCategoria(Categoria categoria){
		this.categorias.add(categoria);

	}
	
	public void agregarPosteo(Posteo posteo) {
		this.posteo.add(posteo);
	}
	
	

}
