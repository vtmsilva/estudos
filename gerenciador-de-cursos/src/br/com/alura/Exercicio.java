package br.com.alura;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        
       for(int chave : pessoas.keySet()) {
    	   System.out.println(pessoas.get(chave));
       }
       
       pessoas.keySet().forEach(idade -> {
    	   System.out.println("***********" + pessoas.get(idade));
       });
     
    }

}
