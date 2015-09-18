package br.com.devmedia.mvc.config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("mvc")
public class MinhaApplicacaoMvc extends Application{
	
	/*@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		properties.putAll(super.getProperties());
		properties.put("javax.mvc.engine.ViewEngine.viewFolder", "/WEB-INF/OUTRO_DIRETORIO/");
		return properties;
	}*/
	
}
