import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        String nomeFormatado = nome.trim();

        System.out.println("Nome formatado: " +nomeFormatado);
    }
}
