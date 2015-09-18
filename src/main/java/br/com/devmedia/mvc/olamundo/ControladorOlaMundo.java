package br.com.devmedia.mvc.olamundo;

import javax.mvc.Controller;
import javax.mvc.View;
import javax.mvc.Viewable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Controller
@Path("ola_mundo")
public class ControladorOlaMundo{

	@GET
	@Path("exibe_pagina_usando_string")
	public String exibePaginaUsandoString(){
		return "ola_mundo.jsp";    
	}
	
	@GET
	@Path("exibe_pagina_usando_void")
	@View("ola_mundo.jsp")
	public void exibePaginaUsandoVoid(){
	}
	
	@GET
	@Path("exibe_pagina_usando_viewable")
	public Viewable exibePaginaUsandoViewable(){
		return new Viewable("ola_mundo.jsp");    
	}
	
	@GET
	@Path("exibe_pagina_usando_response")
	public Response exibePaginaUsandoResponse(){
		return Response.ok().entity("ola_mundo.jsp").build();    
	}
}