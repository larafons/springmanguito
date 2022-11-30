package ttps.spring.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Posteo {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String foto; //ver como convertir en String
	@Column
	private String texto;
	@Column
	private LocalDate fecha;
	
	public Posteo(String texto) {
		this.texto = texto;
	}
	public Posteo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Posteo [id=" + id + ", foto=" + foto + ", texto=" + texto + ", fecha=" + fecha.toString() + "]";
	}
	
	
}
