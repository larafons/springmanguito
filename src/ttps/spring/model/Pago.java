package ttps.spring.model;
import javax.persistence.*;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Pago implements java.io.Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pago_id")
	private Long id;
	@Column
	private double precio;
	@Column
	private String mensaje;
	@Column
	private String nombreDonador;
	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column
	private String emailDonador;
	@Column
	private String telefonoDonador;

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