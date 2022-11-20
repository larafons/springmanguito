package ttps.spring.model;
import javax.persistence.*;

@Entity
public class Emprendedor {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="administrador_id")
	private Long id;
	@Column
	private String passwd;
	@Column
	private String usuario;
	@OneToOne(cascade = CascadeType.ALL)
	private Emprendimiento emprendimiento;
	
	public Emprendedor(String passwd, String usuario) {
		this.passwd = passwd;
		this.usuario = usuario;
	}
	
	
	public Emprendedor() {
		super();
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
		

}
