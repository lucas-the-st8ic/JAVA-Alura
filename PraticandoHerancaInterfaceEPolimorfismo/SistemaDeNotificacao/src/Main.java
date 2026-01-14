import br.com.Alura.Email;
import br.com.Alura.Notificacao;
import br.com.Alura.Push;
import br.com.Alura.SMS;

public class Main {
    static void main(String[] args) {

        Notificacao eMail01 = new Email("lucas@ss.com.br", "Aproveite nossos descontos esta semana.","Promoção Especial!");

        Notificacao sms01 = new SMS("(11) 95789-4568","Sua fatura foi paga com sucesso.");

        Notificacao push = new Push("usuario_app","Você tem uma mensagem não lida.", "Novidade!!!");


        eMail01.enviar();
        sms01.enviar();
        push.enviar();
    }
}
