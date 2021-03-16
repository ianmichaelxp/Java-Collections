package br.com.pratice;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		ArrayList<String> listaAlunos = new ArrayList<String>();
		
		String aluno1 = "ian";
		String aluno2 = "ain";
		String aluno3 = "nia";
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		Collections.sort(listaAlunos);
		
		for (String aluno : listaAlunos) {
			System.out.println(aluno);
		}
	}
}
