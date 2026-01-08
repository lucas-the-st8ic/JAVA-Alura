package br.com.alura.encapsulamento;

public class Aluno {
    private String nomeAluno;
    private int nivel;
    private int pontos;


    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontos() {
        return pontos;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;
        atualizarNivel();
    }
    private void atualizarNivel() {
        this.nivel = (pontos / 100) +1;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + this.nomeAluno);
        System.out.println("Pontos: " + this.pontos);
        System.out.println("Nivel: " + this.nivel);
    }
}
