import br.com.Alura.Deposito;
import br.com.Alura.OperacaoBancaria;
import br.com.Alura.Saque;

public class Main {
    static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(275.50);
        OperacaoBancaria saque = new Saque(25.50);

        deposito.executar();

        saque.executar();



    }
}
