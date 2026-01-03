package br.com.Alura;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargoAtual;
    public int nivelDeAcessoAtual;

    private int controleDeReajuste = 0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public void exibirInformacoesFuncionario() {
        System.out.printf("Funcionário: %s \n Cargo: %s \n Salário %.2f\n", nome, cargoAtual, salario);
    }

    public void reajustarSalario (double percentual) {
        if (controleDeReajuste >= 1) {
            System.out.println("Não pode ser mais reajustado");
        } else {
            controleDeReajuste++;
            salario += salario * (percentual / 100);
            System.out.printf("Novo salario de %s é %.2f \n", nome, salario);
        }

    }

    public void alterarCargoAcesso(String cargoNovo, int nivelDeAcessoNovo ) {



        System.out.println("\t--Acesso antigo do funcionário--");
        System.out.println("Nome: " + nome+ "\nCargo: " +cargoAtual);
        System.out.println("Nível de Acesso: " +nivelDeAcessoAtual);
        System.out.println("_____________________________________");

        cargoAtual = cargoNovo;
        nivelDeAcessoAtual = nivelDeAcessoNovo;


        System.out.println("\t---Novo acesso do funcionário---");
        System.out.println("Nome: " + nome+ "\nCargo: " +cargoAtual);
        System.out.println("Nível de Acesso: " +nivelDeAcessoAtual);
        System.out.println("_____________________________________");
    }
}
