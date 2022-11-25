package ttps.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlanComprado {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
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

	public PlanComprado() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	

}
