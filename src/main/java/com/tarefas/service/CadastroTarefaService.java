package com.tarefas.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.tarefas.model.Tarefa;
import com.tarefas.repository.Tarefas;
import com.tarefas.util.Transacional;

public class CadastroTarefaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Tarefas tarefas;
	
	@Transacional
	public void salvar(Tarefa tarefa) {
		tarefas.cadastrarTarefa(tarefa);
	}
	
	@Transacional
	public void excluir(Tarefa tarefa) {
		tarefas.excluirTarefa(tarefa);
	}

}