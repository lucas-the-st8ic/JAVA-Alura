package br.com.Alura;

public class Push extends Notificacao {

    String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push para: " + destinatario+
                "\nTitulo: " +titulo+ "\nConteúdo: " +mensagem+
                "\n=====================================");
    }
}
