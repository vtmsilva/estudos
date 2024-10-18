package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso2 {
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

		List<Aula> aulas = new ArrayList<>(javaColecoes.getAulas());

		aulas.add(new Aula("Trabalhando com copia", 2));

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(aulas);
//		Collections.sort(javaColecoes.getAulas(), Comparator.comparing(Aula::getTempo));

		System.out.println(javaColecoes.getNome());

		System.out.println(javaColecoes);
		
		List<String> list = new ArrayList<String>(Collections.nCopies(1000, (String)"bbb"));
		list.add("aaaaaaaaaaaaaaaa");
		Collections.sort(list);
		System.out.println(list);
	}
}
