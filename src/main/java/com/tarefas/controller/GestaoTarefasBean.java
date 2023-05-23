package com.tarefas.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.tarefas.model.PrioridadeTarefa;
import com.tarefas.model.SituacaoTarefa;
import com.tarefas.model.Tarefa;
import com.tarefas.repository.Tarefas;
import com.tarefas.service.CadastroTarefaService;
import com.tarefas.util.FacesMessages;

@Named
@ViewScoped
public class GestaoTarefasBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Tarefas tarefas;
	
	@Inject
    private FacesMessages facesMessages;
	
	@Inject
	private CadastroTarefaService cadastroTarefaService;
	
	private Tarefa tarefa;
	private List<Tarefa> listaTarefas;
	private String termoPesquisa;
	
	public void novaTarefa() {
		tarefa = new Tarefa();
	}
	
	public void salvarTarefa() {
		cadastroTarefaService.salvar(tarefa);
		atualizarListaTarefas();
		facesMessages.info("Tarefa salva com sucesso!");
	}
	
	public void excluir() {
		cadastroTarefaService.excluir(tarefa);
		tarefa = null;
		atualizarListaTarefas();
		facesMessages.info("Tarefa excluída com sucesso!");
	}
	
	public void concluirTarefa() {
		tarefa.setSituacao(SituacaoTarefa.CONCLUIDO);
		cadastroTarefaService.salvar(tarefa);
		atualizarListaTarefas();
		facesMessages.info("Tarefa conluída!");
	}
	
	public void pesquisar() {
		listaTarefas = tarefas.pesquisarTarefasPorTitulo(termoPesquisa);
        if (listaTarefas.isEmpty()) {
        	facesMessages.info("A consulta não retornou registros");
        }
    }
	
	private void atualizarListaTarefas() {
		if (houvePesquisa()) {
            pesquisar();
        }else {
        	listarAllTarefas();
        }
	}
	
	private boolean houvePesquisa() {
        return termoPesquisa != null && !"".equals(termoPesquisa);
    }
	
	public boolean isSelected() {
		return ((tarefa!=null)&&(tarefa.getId()!=0));
	}
	
	public Tarefa getTarefa() {
		return tarefa;
	}
	
	public void listarAllTarefas() {
		listaTarefas = tarefas.listarTarefas();
	}
	
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	public List<Tarefa> getListaTarefas(){
		return listaTarefas;
	}

	public String getTermoPesquisa() {
		return termoPesquisa;
	}

	public void setTermoPesquisa(String termoPesquisa) {
		this.termoPesquisa = termoPesquisa;
	}

	public PrioridadeTarefa[] getPrioridadeTarefa() {
		return PrioridadeTarefa.values();
	}
	
	public SituacaoTarefa[] getSituacaoTarefa() {
		return SituacaoTarefa.values();
	}
	
}
