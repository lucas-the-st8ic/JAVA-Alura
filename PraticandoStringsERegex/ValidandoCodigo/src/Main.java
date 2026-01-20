import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String codigo;

        String regex = "^[A-Z]{3}-\\d{4}$";

        System.out.print("Digite um codigo: ");
        codigo = input.nextLine();


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codigo);

        if (matcher.matches()) {
            System.out.println("O código é válido!");
        }  else {
            System.out.println("O código é inválido!");
        }

    }
}
