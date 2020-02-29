package Clases;

public class Usuario {
	private String nombreusuario;
	private String correoelectronico;
	
	public Usuario(String nombreusuario, String correoelectronico) {
		this.nombreusuario = nombreusuario;
		this.correoelectronico = correoelectronico;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	
	public String toString() {
		return "Usuario [nombreusuario=" + nombreusuario + ", correoelectronico=" + correoelectronico + "]";
	}

	public boolean VerificarCorreo () {
		
		if(correoelectronico.indexOf("@") == correoelectronico.lastIndexOf("@"))
			return true;
		
		return false;
	}
	

}
