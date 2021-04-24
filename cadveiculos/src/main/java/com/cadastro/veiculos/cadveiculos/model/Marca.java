package com.cadastro.veiculos.cadveiculos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_marca;
	private String descricao;
	
	public Marca(Integer id_marca, String descricao) {
		super();
		this.id_marca = id_marca;
		this.descricao = descricao;
	}
	
	public Marca() {
	
	}

	public long getId_marca() {
		return id_marca;
	}

	public void setId_marca(long id_marca) {
		this.id_marca = id_marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
