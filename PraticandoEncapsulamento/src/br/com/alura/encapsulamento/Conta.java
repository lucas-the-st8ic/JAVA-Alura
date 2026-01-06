package br.com.alura.encapsulamento;

public class Conta {
    private String titularConta;
    private double saldoConta;
    

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }


    public Conta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldoConta +=  valor;
        } else if (valor < 0) {
            System.out.println("Não é possível depositar valores negativos!! Operação encerrada");
            System.out.printf("Saldo em conta: R$ %2.f ", saldoConta);
        }
    }

    public void sacar(double valor) {
        if(valor > saldoConta){
            System.out.println("Saldo insuficiente para saque!!");
            System.out.printf("Saldo em conta: R$ %2.f%n", saldoConta);
        } else  {
            this.saldoConta -= valor;
            System.out.printf("Saldo em conta: R$ %2.f%n", saldoConta);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " +titularConta+ " : R$" + saldoConta);
    }
}
