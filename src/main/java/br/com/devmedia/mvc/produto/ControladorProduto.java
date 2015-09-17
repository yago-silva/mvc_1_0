package br.com.devmedia.mvc.produto;

import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Controller
@Path("produtos")
public class ControladorProduto {

	@GET
	@Path("home")
	public Response home() {
		return Response.status(Response.Status.FOUND)
                .header("Location", "redirect/here")
                .build();
	}
	
	@GET
	@Path("inicio")
	public String inicio() {
		return "inicio.jsp";
	}
}
