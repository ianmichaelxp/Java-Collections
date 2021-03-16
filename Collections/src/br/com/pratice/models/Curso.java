package br.com.pratice.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome;
	private int cargaHoraria;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Curso: " + this.nome + " | Carga Horária: " + this.cargaHoraria + " | " + this.alunos;
	}
	
	
	

}
