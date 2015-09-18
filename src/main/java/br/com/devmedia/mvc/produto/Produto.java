package br.com.devmedia.mvc.produto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;

public class Produto {
	
	@FormParam("id")
	private Integer id;
	
	@FormParam("nome")
	@NotNull
	private String nome;
	
	@FormParam("preco")
	@NotNull
	private BigDecimal preco;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}