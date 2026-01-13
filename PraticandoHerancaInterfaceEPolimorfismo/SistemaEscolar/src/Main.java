import br.com.Alura.Aluno;
import br.com.Alura.Docente;

public class Main {
    static void main(String[] args) {

        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.5);

        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 54, "Geografia");

        aluno1.exibirDados();
        aluno2.exibirDados();
        docente1.exibirDados();
        docente2.exibirDados();
    }
}
