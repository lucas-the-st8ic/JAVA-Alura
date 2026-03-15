package br.com.exerciciosstreamelambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio_3 {

        static void main(String[] args) {
            List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

            String listaDeNomes = nomes.stream()
                    .collect(Collectors.joining(", "));

            System.out.println(listaDeNomes);
        }
}
