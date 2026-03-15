package br.com.exerciciosstreamelambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio_1 {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> min = numeros.stream()
                .min(Comparator.naturalOrder());

        System.out.println(min.get());
    }
}
