package br.com.Alura;

public class Email extends Notificacao {

    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email para: " + destinatario+
                "\nAssunto: " +assunto+ "\nCorpo: " +mensagem+
                "\n=====================================");
    }
}
