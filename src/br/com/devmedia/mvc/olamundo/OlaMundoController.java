package br.com.devmedia.mvc.olamundo;

import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("ola_mundo")
public class OlaMundoController{

	@GET
	@Path("exibe_pagina")
	public String exibePagina(){
		return "ola_mundo.jsp";    
	}
	
	@GET
	@Path("exibe_mesma_pagina")
	@View("ola_mundo.jsp")
	public void exibeMesmaPagina(){
	}
}