package br.com.alura;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\n\nGerente: %s\nSalário: R$%.2f\nBônus: R$%.2f\n\n", super.nome, super.salario, bonus);
    }
}
