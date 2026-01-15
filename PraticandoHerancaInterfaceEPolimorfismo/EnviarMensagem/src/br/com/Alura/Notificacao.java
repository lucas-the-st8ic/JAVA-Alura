package br.com.Alura;

public class Notificacao {
    protected  String nome;
    protected String mensagem;
    protected int quantidade;

    public Notificacao(String nome, String mensagem, int quantidade) {
        this.nome = nome;
        this.mensagem = mensagem;
        this.quantidade = quantidade;
    }

    public Notificacao() {
    }

    public String getNome() {
        return nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void enviarMensagem (String mensagem) {
        System.out.println("Mensagem enviada para todos: " +mensagem);
    }

    public void enviarMensagem(String nome, String mensagem){
        System.out.println("Mensagem para " +nome+ ": " +mensagem);
    }

    public void enviarMensagem(String nome, String mensagem, int quantidade) {
        for(int i = 0; i < quantidade; i++) {
            System.out.println("Mensagem para " +nome+ ": " +mensagem);
        }
    }
}
