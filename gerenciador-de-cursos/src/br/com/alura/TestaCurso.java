package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Victor Marques");
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		
//		aulas.add(new Aula("Trabalhando com Arraylist", 21));
		
//		javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));
		
		javaColecoes.adiciona(new Aula("Relacionamento com coleções", 23));
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com List", 10));
		
		
		List<Aula> alinhas = new ArrayList<>(javaColecoes.getAulas());
		
		alinhas.add(new Aula("Trabalhando com copia", 2));
		
		Collections.sort(alinhas, Comparator.comparing(Aula::getTempo));
		System.out.println(alinhas);
//		Collections.sort(javaColecoes.getAulas(), Comparator.comparing(Aula::getTempo));
		
		System.out.println(javaColecoes.getNome());
		
		System.out.println(javaColecoes.getAulas());
	}
}
