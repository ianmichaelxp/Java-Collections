package br.com.pratice;

import java.util.ArrayList;
import java.util.List;

import br.com.pratice.models.Aluno;

public class TestandoListasObjetos {
	
	public static void main(String[] args) {
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno("Ian", 25);
		Aluno aluno2 = new Aluno("Joao", 11);
		Aluno aluno3 = new Aluno("Pedro", 10);
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		/**
		 * Ordenação pela idade
		 * 
		 */
		listaAlunos.sort((a1,a2)-> Integer.compare(a1.getIdade(), a2.getIdade()));
		
		/**
		 * Ordenação pelo nome
		 * 
		 */
		listaAlunos.sort( (a1,a2)-> a1.getNome().compareTo(a2.getNome()) ); 
		
		/**
		Collections.sort(listaAlunos, Comparator.comparing(Aluno::getNome));
		
		Collections.sort(listaAlunos);
		Collections.reverse(listaAlunos);
		
		*/
		
		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno);
		}
		
		
		
		
		
		
	}

}
