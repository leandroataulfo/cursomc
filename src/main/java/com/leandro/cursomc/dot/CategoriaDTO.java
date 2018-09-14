package com.leandro.cursomc.dot;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.leandro.cursomc.domain.Categoria;

public class CategoriaDTO {

	
	
	

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	
	@SuppressWarnings("deprecation")
	@NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5,max=80,message="O tamanho deve ser entre 5 e 80 caracteres" )
	private String nome;
	
	
	public CategoriaDTO() {
		
	}

	
	public CategoriaDTO (Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

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
	
	
}
