package com.algaworks.erp.model;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;


//Se só estiver o Entity, ele vai procurar uma tabela com o nome de RamoAtividade. Por isso é necessário informar o table
@Entity
@Table(name="ramo_atividade")
public class RamoAtividade implements Serializable {


	private static final long serialVersionUID = 1L;

	
	//O @id informa que é uma Primary Key
	//O GeneratedValue gera um valor pro ID automaticamente.
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false ,length = 80)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
