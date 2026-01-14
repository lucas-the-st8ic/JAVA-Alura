package br.com.Alura;

public class Boleto extends Pagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Boleto (Taxa: R$%.2f)\n",
                valor, calcularTaxa());
    }

    @Override
    public double calcularTaxa() {
        return valor * 0.01;
    }
}
