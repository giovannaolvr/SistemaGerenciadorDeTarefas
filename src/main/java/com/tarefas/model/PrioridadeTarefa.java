package com.tarefas.model;

public enum PrioridadeTarefa {
	
	ALTA("Alta"),
	MEDIA("Media"),
	BAIXA("Baixa");
	
	private String descricao;
	
	PrioridadeTarefa(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
