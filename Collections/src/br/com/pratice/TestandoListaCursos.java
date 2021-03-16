package br.com.pratice;

import java.util.ArrayList;
import br.com.pratice.models.Aluno;
import br.com.pratice.models.Curso;

public class TestandoListaCursos {
	
	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>() {
			
			private static final long serialVersionUID = 1L;

			{
				add(new Aluno("Ian", 25));
				add(new Aluno("Joao", 15));
				add(new Aluno("Pedro", 10));
			}
		};
		
		Curso curso = new Curso("Curso A", 40, alunos);
		
		System.out.println(curso);
		
		Curso curso2 = new Curso("Curso B", 20, alunos);
		
		System.out.println(curso2);
		
		Aluno alunoRet = new Aluno("Beltrano", 30);
		
		curso2.adicionar(alunoRet);
		
		System.out.println(curso2);
		
		//TODO Criar cópia de Lista de alunos para ordena-los
	}

}
