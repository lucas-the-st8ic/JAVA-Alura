import br.com.Alura.Boleto;
import br.com.Alura.CartaoDeCredito;
import br.com.Alura.Pagamento;
import br.com.Alura.Pix;

void main() {

    Pagamento pagamentoCartao = new CartaoDeCredito(500);
    Pagamento pagamentoBoleto = new Boleto(150);
    Pagamento pagamentoPix = new Pix(300);

    pagamentoCartao.confirmarPagamento();
    pagamentoBoleto.confirmarPagamento();
    pagamentoPix.confirmarPagamento();


}
