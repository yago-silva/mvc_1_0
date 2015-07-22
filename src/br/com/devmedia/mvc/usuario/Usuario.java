package br.com.devmedia.mvc.usuario;

import javax.ws.rs.FormParam;

public class Usuario {
	
	@FormParam("email")
	private String email;
	
	@FormParam("senha")
	private String senha;

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
	
}
