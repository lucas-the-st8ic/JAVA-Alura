import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto;


        System.out.print("Digite o texto: ");
        texto = input.nextLine();

        System.out.println("Texto em maiúsculas: " +texto.toUpperCase());
        System.out.println("Texto em minúsculas: " +texto.toLowerCase());
    }
}
