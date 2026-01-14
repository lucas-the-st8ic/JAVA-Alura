package br.com.Alura;

public class CartãoDeCredito extends Pagamento{


    public CartãoDeCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de crédito (Taxa: R$%.2f)\n",
                valor, calcularTaxa());
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.03;
    }
}
