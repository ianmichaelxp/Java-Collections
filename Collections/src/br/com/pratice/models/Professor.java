package br.com.pratice.models;

public class Professor {
	
	private String nome;
	private Integer matricula;
	
	public Professor(String nome, int matricula) {
		if(nome == null || matricula == 0) {
			throw new NullPointerException("Não pode ser nulo");
		}
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
	
	@Override
	public boolean equals(Object obj) {
		Professor prof = (Professor) obj;
		if(this.matricula == prof.getMatricula()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.matricula.hashCode();
	}
	

}
