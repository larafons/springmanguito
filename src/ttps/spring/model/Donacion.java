package ttps.spring.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Donacion {


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private LocalDate fecha;
	@Column
	private int cantManguitos;
	@OneToOne
	private Emprendimiento emprendimiento;
	@Column
	private double precio;
	@Column
	private String mensaje;
	@Column
	private String nombreDonador;
	@Column
	private String emailDonador;
	@Column
	private String telefonoDonador;
	
	public Donacion() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNombreDonador() {
		return nombreDonador;
	}

	public void setNombreDonador(String nombreDonador) {
		this.nombreDonador = nombreDonador;
	}

	public String getEmailDonador() {
		return emailDonador;
	}

	public void setEmailDonador(String emailDonador) {
		this.emailDonador = emailDonador;
	}

	public String getTelefonoDonador() {
		return telefonoDonador;
	}

	public void setTelefonoDonador(String telefonoDonador) {
		this.telefonoDonador = telefonoDonador;
	}

	@Override
	public String toString() {
		return "Donacion [id=" + id + ", fecha=" + fecha.toString() + ", cantManguitos=" + cantManguitos + ", emprendimiento="
				+ emprendimiento.getNombre() + ", precio=" + precio + ", mensaje=" + mensaje + ", nombreDonador=" + nombreDonador
				+ ", emailDonador=" + emailDonador + ", telefonoDonador=" + telefonoDonador + "]";
	}
	
	

	
	
	
}
