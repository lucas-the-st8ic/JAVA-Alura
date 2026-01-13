package br.com.alura;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.printf("\nFuncionario: %s\nSalário: R$%.2f\n", nome, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salário de %s é R$%.2f \n", nome, salario);
    }

    public void reajustarSalario() {
        salario += 500;
        System.out.printf("\nSalário com dissídio de %s é R$%.2f \n", nome, salario);
    }

    public abstract void calcularPLR();
}
