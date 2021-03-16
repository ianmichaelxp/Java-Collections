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
		
		
		Professor prof1 = new Professor("Maria", 1001);
		Professor prof2 = new Professor("João", 1002);
		Professor profSubst = new Professor("João", 1002);
		
		Aluno novato1 = new Aluno("Leonardo", 17);
		//Aluno novato2 = new Aluno("Leonardo", 17);
		
		curso.adicionar(prof1);
		curso.adicionar(prof2);
		curso.adicionar(novato1);
		//curso.adicionar(novato2);
		
		System.out.println(curso);
		
		System.out.println(curso.estaRegistrado(profSubst));
		
		System.out.println(prof2.equals(profSubst));
		
		
		

		


		
		
		
	}

}
