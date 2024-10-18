package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class Testatudo {
	public static void main(String[] args) {
		ArrayList<Curso> cursos = new ArrayList<>();
		Curso curso1 = new Curso("victor", "Alanna");
		Curso curso2 = new Curso("tictor", "ZAlanna");
		Curso curso3 = new Curso("Dictor", "bAlanna");
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		ListIterator<Curso> iterator = cursos.listIterator();
		System.out.println(iterator);
		 while (iterator.hasNext()) {
	            Curso curso = iterator.next();
	            System.out.println(curso);
	        }
		 Collections.sort(cursos, Comparator.comparing(Curso::getNome, String.CASE_INSENSITIVE_ORDER));
//		 Collections.sort(cursos, Comparator.comparing(Curso::getInstrutor, String.CASE_INSENSITIVE_ORDER));
//		 agora na classe estou sobrescrevendo o contrutor compareTo e usando o compareToIgnoreCase,
//		 então é só usar o de baixo
		 Collections.sort(cursos);

		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("aaaaa" + cursos.get(i));

		}
	}
}
