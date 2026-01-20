import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor;

        System.out.print("Digite o valor: R$");
        valor = input.nextDouble();

        System.out.printf("Valor formatado: R$%.2f\n", valor);
    }
}
