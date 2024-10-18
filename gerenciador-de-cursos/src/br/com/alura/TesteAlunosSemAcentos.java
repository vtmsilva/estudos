package br.com.alura;

import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat");

        System.out.println(alunos.size());

        alunos.add("Nico Steppat");
        

        System.out.println(alunos.size());
    }
}