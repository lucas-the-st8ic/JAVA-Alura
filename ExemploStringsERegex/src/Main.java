import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aluno = "Lucas Silva";

        String curso = "Java e Programação Orientada a Objetos";

        String curriculo = """
                Assistente Administrativo e estudante de análise e
                desenvolvimento de sistemas 
                na anhembi morumbi""";

        String disciplina = String.format("Disciplina: %s - Aluno%s", curso, aluno);
        System.out.println(disciplina);

        System.out.printf("Nome: %s\nDisciplina: %s\n", aluno, curso);

        String email = "Meu E-mail é lucas.ss@gmail.com";

        Pattern pattern = Pattern.compile("\\w+@\\W+.\\w+");

        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println(formatarTelefone("11957387490"));

    }

    public static String formatarTelefone(String telefone) {
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()) {
            return String.format("Telefone: (%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }
        return "Número de telefone inválido!";
    }
}
