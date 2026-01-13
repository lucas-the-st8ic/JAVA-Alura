package br.com.Alura;

public class Docente extends Pessoa{
    private String materia;

    public Docente(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    public void exibirDados() {
        System.out.println("Docente: " +getNome());
        System.out.println("Idade: " +getIdade());
        System.out.println("Matéria: " +materia);
    }
}
