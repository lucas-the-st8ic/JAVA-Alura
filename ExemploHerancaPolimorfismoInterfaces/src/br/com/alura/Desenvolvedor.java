package br.com.alura;

public class Desenvolvedor extends Funcionario {

    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }


    @Override
    public void exibirInformacoes() {
        System.out.printf("Desenvolvedor: %s\nSalário: R$%.2f\nStack: %s", nome, salario, stack);
    }

    @Override
    public void calcularPLR() {
        System.out.println("PLR do desenvolvedor");
    }
}
