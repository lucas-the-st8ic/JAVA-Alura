import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeDoArquivo;
        int ultimaPosicao;

        System.out.print("Digite o nome do arquivo: ");
        nomeDoArquivo = input.nextLine();

        ultimaPosicao = nomeDoArquivo.lastIndexOf('.');

        if (ultimaPosicao != -1) {
            nomeDoArquivo = nomeDoArquivo.substring(0, ultimaPosicao);

            System.out.println("Nome do arquivo sem extensão: " + nomeDoArquivo);
        } else {
            System.out.println("O arquivo não possui extensão!");
        }
    }
}
