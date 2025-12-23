import br.com.Alura.Funcionario;
import br.com.Alura.Produto;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario_01 = new Funcionario();

        funcionario_01.nome = "Lucas";
        funcionario_01.cargo = "Engenheiro de Software Sênior";
        funcionario_01.salario = 15539;

        Funcionario funcionario_02 = new Funcionario();

        funcionario_02.nome = "Matheus";
        funcionario_02.cargo = "Gerente de Projetos";
        funcionario_02.salario = 10879;

        funcionario_01.exibirInformacoesFuncionario();

        funcionario_02.exibirInformacoesFuncionario();

        funcionario_02.reajustarSalario(5);

        funcionario_02.exibirInformacoesFuncionario();

        Produto produto_01 = new Produto();
        produto_01.nomeProduto = "Mouse Gamer";
        produto_01.precoProduto = 451.90;
        produto_01.quantidadeProduto = 50;

        produto_01.exibirProduto();
        System.out.println("Ele disse: \"Olá, Mundo!\"");
    }
}
