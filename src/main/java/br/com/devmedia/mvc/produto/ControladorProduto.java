package br.com.devmedia.mvc.produto;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.validation.ValidationResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Controller
@Path("produto")
public class ControladorProduto {
	
	@Inject
	private Models models;
	
	@Inject
	private ValidationResult result;
	
	@POST
	@ValidateOnExecution(type = ExecutableType.NONE)
	public Response adiciona(@BeanParam @Valid Produto produto) {
		if(result.isFailed()){
			//Lógica para adicionar mensagens de erro a página
			return Response.status(Status.BAD_REQUEST).entity("produto/erro.jsp").build();
		}
		//Lógica para adicionar o produto
		return Response.status(Status.OK).entity("produto/lista.jsp").build();
	}
	
	@PUT
	@ValidateOnExecution(type = ExecutableType.NONE)
	public Response altera(@BeanParam @Valid Produto produto) {
		//Lógica para alterar o produto
		return Response.ok("produto/lista.jsp").build();
	}
	
	@DELETE
	@Path("{id}")
	public String remove(@PathParam("id") int id) {
		//Lógica para remover o produto
		return "produto/lista.jsp";
	}
	
	@GET
	@Path("bla")
	public Integer bla() {
		return 1;
	}
	
	@GET
	@Path("{id}")
	public String exibe(@PathParam("id") int id){
		Produto produto = new Produto();
		produto.setId(id);
		produto.setNome("produto_teste");
		produto.setPreco(new BigDecimal("50"));
		models.put("produto", produto);
		return "produto/exibe.jsp";
	}
}