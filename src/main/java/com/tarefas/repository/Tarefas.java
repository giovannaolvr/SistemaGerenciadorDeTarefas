package com.tarefas.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tarefas.model.Tarefa;

public class Tarefas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Tarefas() {
		
	} 
	
	public Tarefas(EntityManager manager) {
		this.manager = manager;
	}
	
	public Tarefa cadastrarTarefa(Tarefa tarefa) {
		return manager.merge(tarefa);
	}
	
	public void excluirTarefa(Tarefa tarefa) {
		tarefa = getTarefaById(tarefa.getId());
		manager.remove(tarefa);
	}
	
	public Tarefa getTarefaById(Long id) {
		return manager.find(Tarefa.class, id);
	}
	
	public List<Tarefa> pesquisarTarefasPorTitulo(String titulo) {
		String jpql = "FROM Tarefa t WHERE t.titulo LIKE :titulo";
		
		TypedQuery<Tarefa> query = manager
				.createQuery(jpql, Tarefa.class);
		
		query.setParameter("titulo", titulo + "%");
		
		return query.getResultList();
	}
	
	public List<Tarefa> pesquisarTarefasPorSituacao(String situacao) {
		String jpql = "FROM Tarefa t WHERE t.situacao LIKE :situacao";
		
		TypedQuery<Tarefa> query = manager
				.createQuery(jpql, Tarefa.class);
		
		query.setParameter("titulo", situacao + "%");
		
		return query.getResultList();
	}
	
	public List<Tarefa> listarTarefas() {
		return manager.createQuery("from Tarefa", Tarefa.class).getResultList();
	}
	//caso erro: verificar nome da tabela;
}
