package ttps.spring.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Emprendimiento {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
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
	
	@OneToOne(mappedBy="emprendimiento")
	@JsonIgnore
	private Emprendedor emprendedor;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> redes;
		
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<Posteo> posteo = new HashSet<Posteo>();
	
	@OneToMany (fetch = FetchType.EAGER,mappedBy="emprendimiento",cascade = CascadeType.ALL)
	private Set<PlanOfrecido> planesOfrecidos = new HashSet<PlanOfrecido>();
	
	@OneToMany (fetch = FetchType.EAGER,mappedBy="emprendimiento",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Donacion> donaciones = new HashSet<Donacion>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Categoria> categorias = new HashSet<Categoria>();

	
	public Emprendimiento() {
		
	}
	
	@Override
	public String toString() {
		return "Emprendimiento [id=" + id + ", url=" + url + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", banner=" + banner + ", visualizadorManguitos=" + visualizadorManguitos + ", visualizarDonantes="
				+ visualizarDonantes + ", precioManguito=" + precioManguito + ", emprendedor=" + emprendedor.getUsuario()
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

	public void setDonaciones(Set<Donacion> donaciones) {
		this.donaciones = donaciones;
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

	public Set<String> getRedes() {
		return redes;
	}

	public void setRedes(Set<String> redes) {
		this.redes = redes;
	}
 
	public Set<Posteo> getPosteo() {
		return posteo;
	}

	public void setPosteo(Set<Posteo> posteo) {
		this.posteo = posteo;
	}
	
	public Set<Donacion> getDonaciones() {
		return donaciones;
	}

	public void agregarDonacion(Donacion donacion) {
		this.donaciones.add(donacion);
	}

	public Set<PlanOfrecido> getPlanesOfrecidos() {
		return planesOfrecidos;
	}

	public void setPlanesOfrecidos(Set<PlanOfrecido> planesOfrecidos) {
		this.planesOfrecidos = planesOfrecidos;
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
