package com.tarefas.model;

public enum SituacaoTarefa {
	
	ANDAMENTO("Em andamento"),
	CONCLUIDO("Concluído");
	
	private String descricao;
	
	SituacaoTarefa(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
