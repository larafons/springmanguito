package ttps.spring.model;

public class Usuario {
	private String usuario;
	private String password;
	
	public Usuario(String user, String password) {
		super();
		this.usuario = user;
		this.password = password;
	}

	public Usuario () {
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passwd) {
		this.password = passwd;
	}
}
