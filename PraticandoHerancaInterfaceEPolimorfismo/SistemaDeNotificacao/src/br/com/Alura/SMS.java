package br.com.Alura;

public class SMS extends Notificacao {

    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }



    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " +destinatario+
                "\nMensagem: " +mensagem+
                "\n=====================================");
    };

}
