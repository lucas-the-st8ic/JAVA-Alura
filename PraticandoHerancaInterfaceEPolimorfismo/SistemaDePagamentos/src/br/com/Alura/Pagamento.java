package br.com.Alura;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public Pagamento() {
    }

    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado\n", valor);
     };

     public double calcularTaxa() {
         return valor * 0.0;
     }
}
