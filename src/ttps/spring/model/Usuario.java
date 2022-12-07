package ttps.spring.model;

public class Usuario {
	private String usuario;
	private String passwd;
	
	public Usuario(String user, String password) {
		super();
		this.usuario = user;
		this.passwd = password;
	}

	public Usuario () {
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
