package ttps.spring.model;
import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.*;

@Entity
public class Donacion extends Pago{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="donacion_id")
	private Long id;
	public Donacion() {
		super();
	}
	@Column
	private LocalDate fecha;
	@Column
	private int cantManguitos;
	@OneToOne
	private Emprendimiento emprendimiento;
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getCantManguitos() {
		return cantManguitos;
	}
	public void setCantManguitos(int cantManguitos) {
		this.cantManguitos = cantManguitos;
	}
}
