import br.com.alura.Desenvolvedor;
import br.com.alura.Funcionario;
import br.com.alura.Gerente;

void main(String[] args) {
    Funcionario gerente = new Gerente("Lucas",150000);


    gerente.reajustarSalario(2);
    gerente.reajustarSalario();
    gerente.exibirInformacoes();
    ((Gerente) gerente).setBonus(1000);

    Funcionario dev = new Desenvolvedor("Lucas", 1500000, "Java/Back-end");
    Funcionario dev001 = new Desenvolvedor("Jhon Doe", 90000, "Java/Back-end");

    dev.exibirInformacoes();

    gerente.exibirInformacoes();

    dev001.reajustarSalario();
    dev001.exibirInformacoes();
}
