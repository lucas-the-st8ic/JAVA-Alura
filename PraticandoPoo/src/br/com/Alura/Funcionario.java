package br.com.Alura;

public class Funcionario {

    public String nome;
    public String cargo;
    public double salario;


    public void exibirInformacoesFuncionario() {
        System.out.printf("Funcionário: %s - Cargo: %s - Salário %.2f\n", nome, cargo, salario);
    }

    public void reajustarSalario (double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Novo salario de %s é %.2f \n", nome, salario);
    }
}
