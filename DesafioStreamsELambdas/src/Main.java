import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> maiorNumero = numeros.stream()
                .max(Integer::compare);

        maiorNumero.ifPresent(System.out::println);

        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Optional<String> palavrasAgrupadas = palavras.stream()
                .collect()
    }
}
