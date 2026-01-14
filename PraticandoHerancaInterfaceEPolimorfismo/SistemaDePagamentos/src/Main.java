import br.com.Alura.CartãoDeCredito;
import br.com.Alura.Pagamento;

void main() {

    Pagamento pagamentoCartao = new CartãoDeCredito(250);
    
    pagamentoCartao.confirmarPagamento();

}
