package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Mauricio Anich333ee", 17645);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
        
        Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
        System.out.println("O aluno " + a4 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a4));
        
        Aluno rodrigo = new Aluno("Rodrigo Turini", 34672);
        Aluno victor = new Aluno("victor marques", 200397);
        
        javaColecoes.matricula(victor);
        System.out.println(javaColecoes.estaMatriculado(victor));
        
        System.out.println(rodrigo.hashCode() + "   " + a1.hashCode());
        
        System.out.println("O aluno " + rodrigo.getNome() + ", matricula " + rodrigo.getNumeroMatricula()  + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(rodrigo));
        
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        
    }
}