package br.com.devmedia.mvc.usuario;

import javax.mvc.Controller;
import javax.mvc.View;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("usuario")
public class ControladorUsuario{

    @POST
    @Path("login")
    @View("inicio.jsp")
    public void login(@BeanParam Usuario usuario) {
    	//Aqui vai a lógica para fazer login do usuário
    	System.out.println(usuario);
    }
}
