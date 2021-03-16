package br.com.pratice;

import java.util.ArrayList;
import java.util.List;

import br.com.pratice.models.Aluno;
import br.com.pratice.models.Curso;
import br.com.pratice.models.Professor;

public class TestandoSetCursos {
	
	private static Professor professorSubst = new Professor("Luis", 10000);

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>() {
			
			private static final long serialVersionUID = 1L;

			{
				add(new Aluno("Ian", 25));
				add(new Aluno("Joao", 15));
				add(new Aluno("Pedro", 10));
			}
		};
		
		
		
		Curso curso = new Curso("Curso A", 40, alunos);
		
		Curso curso2 = new Curso("Curso B", 20, alunos);
		
		//System.out.println(curso2);
		
		curso.adicionar(new Professor("Maria", 1001));
		curso.adicionar(new Professor("João", 1002));
		curso.adicionar(professorSubst);
		curso.adicionar(professorSubst);
		
		System.out.println(curso);

		
		
		
	}

}
