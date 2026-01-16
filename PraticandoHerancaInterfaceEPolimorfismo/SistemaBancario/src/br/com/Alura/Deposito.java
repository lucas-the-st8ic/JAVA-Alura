package br.com.Alura;

public class Deposito extends OperacaoBancaria implements AcaoBancaria {

    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Deposito de R$%.2f realizado.\n", valor);
    }
}
