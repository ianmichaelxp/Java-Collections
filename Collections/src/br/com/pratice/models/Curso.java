package br.com.pratice.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
	private int cargaHoraria;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private Set<Professor> professores = new HashSet<Professor>();
	
	public Curso(String nome, int cargaHoraria) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso(String nome, int cargaHoraria, List<Aluno> alunos) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.alunos = alunos;
	}

	public Curso(String nome, int cargaHoraria, List<Aluno> alunos, Set<Professor> professores) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.alunos = alunos;
		this.professores = professores;
	}

	public Set<Professor> getProfessores() {
		return Collections.unmodifiableSet(this.professores);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(this.alunos);
	}

	public void adicionar(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void adicionar(Professor professor) {
		this.professores.add(professor);
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + " | Carga Horária: " + this.cargaHoraria + " | " + this.alunos + " | " + this.professores;
	}
	
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public boolean estaRegistrado(Professor profesor) {
		return this.professores.contains(profesor);
	}
	
	
	
	
	

}
