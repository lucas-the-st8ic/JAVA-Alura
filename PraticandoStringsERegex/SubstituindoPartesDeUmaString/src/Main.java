import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto;
        String palavraAntiga;
        String novaPalavra;

        System.out.print("Digite o texto: ");
        texto = input.nextLine();

        System.out.print("Digite a palavra a ser substituída: ");
        palavraAntiga = input.nextLine();

        System.out.print("Digite a nova palavra: ");
        novaPalavra = input.nextLine();

        if (texto.contains(palavraAntiga)) {
            texto = texto.replace(palavraAntiga, novaPalavra);

            System.out.println("Texto modificado: " +texto);
        } else  {
            System.out.println("Palavra não encontrada no texto.");
        }

    }
}
