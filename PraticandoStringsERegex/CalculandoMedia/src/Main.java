import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double total = notas.stream()
                .reduce(0.0, Double::sum);

        double menorNota = notas.stream()
                .min(Double::compare).get();

        double maiorNota = notas.stream()
                .max(Double::compare).get();

        double media = total / (double) notas.size();


        System.out.printf("A média das notas é: %.1f\n", media);
        System.out.println("A menor nota foi: " +menorNota);
        System.out.println("A maior nota foi: " +maiorNota);
    }
}
