package br.com.devmedia.mvc.produto;

import java.util.Calendar;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.mvc.event.ControllerMatched;

@RequestScoped
public class TrackerDeControladores {
	
	public void audita(@Observes ControllerMatched event){
		Calendar hoje = Calendar.getInstance();
		String nomeControlador = event.getResourceInfo().getResourceClass().getSimpleName();
		//Lógica para guardar as informações no banco de dados
	}
}