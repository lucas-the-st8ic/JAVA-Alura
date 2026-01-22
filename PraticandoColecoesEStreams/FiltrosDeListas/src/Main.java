import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        List<String> funcionarios = List.of("Anna", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> funcionariosComNomesCurtos =  funcionarios.stream()
                .filter(f -> f.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(funcionariosComNomesCurtos);


    }
}
