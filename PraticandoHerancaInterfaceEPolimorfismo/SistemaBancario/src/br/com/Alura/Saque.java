package br.com.Alura;

public class Saque extends OperacaoBancaria implements AcaoBancaria {

    public Saque(double valor) {
        super(valor);
    }


    @Override
    public void executar() {
        System.out.printf("Saque de R$%.2f realizado.\n", valor);
    }
}
