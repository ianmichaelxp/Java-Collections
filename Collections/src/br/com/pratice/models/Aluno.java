package br.com.pratice.models;


public class Aluno { //implements Comparable<Aluno>{

	private String nome;
	private Integer idade;
	
	public Aluno(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome do aluno: " + this.nome + " | Idade: " + this.idade;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		if(this.nome == aluno.getNome() && this.idade == aluno.getIdade()) {
			return true;
		}
		return false;
	}
	
	/**

	@Override
	public int compareTo(Aluno a) {
		
		return Integer.compare(this.idade, a.idade);	
	
	}
	*/
		
}
