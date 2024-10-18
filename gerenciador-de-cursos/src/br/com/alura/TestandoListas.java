package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {

		String aula1 = "conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.remove(1);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
			
		}
		
		Collections.sort(aulas);
		
		aulas.forEach(aula -> {
		    System.out.println("Percorrendo:");
		    System.out.println("Aula " + aula);
		});
		
	}

}
