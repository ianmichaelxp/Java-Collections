package br.com.pratice.models;

public class Professor {
	
	private String nome;
	private int matricula;
	
	public Professor(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "\nNome do professor: " + this.nome + " | Matrícula: " + this.matricula;
	}
	

}
