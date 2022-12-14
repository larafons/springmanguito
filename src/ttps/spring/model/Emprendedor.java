package ttps.spring.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emprendedor {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String passwd;
	@Column
	private String usuario;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Emprendimiento emprendimiento;
	
	public Emprendedor() {

	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}
	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}


	@Override
	public String toString() {
		return "Emprendedor [id=" + id + ", usuario=" + usuario + "]";
	}
	
	
		

}
