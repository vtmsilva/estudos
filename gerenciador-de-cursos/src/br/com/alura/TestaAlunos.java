package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

//        Set<String> alunos = new HashSet<>();
    	Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior
        
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos);
        
        List<String> alunosEmLista = new ArrayList<>(alunos);
        
        System.out.println(alunosEmLista.get(2));
    }
}
