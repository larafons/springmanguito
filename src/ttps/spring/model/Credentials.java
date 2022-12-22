package ttps.spring.model;

public class Credentials { // Intercambiar nombre de clase con Usuario
	 private String token;
	    private int exp;
	    private String username;
	    private boolean admin;

	    public boolean isAdmin() {
			return admin;
		}

		public void setAdmin(boolean admin) {
			this.admin = admin;
		}

		public Credentials() {
	    }

	    public Credentials(String token, int exp, String username) {
	        this.token = token;
	        this.exp = exp;
	        this.username = username;
	    }

	    public String getToken() {
	        return token;
	    }

	    public void setToken(String token) {
	        this.token = token;
	    }

	    public int getExp() {
	        return exp;
	    }

	    public void setExp(int exp) {
	        this.exp = exp;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

}