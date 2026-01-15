import br.com.Alura.Notificacao;

void main(String[] args) {
    Notificacao notificacoes = new Notificacao();

    notificacoes.enviarMensagem("Olá!!\nSejam-todos Bem vindos");
    notificacoes.enviarMensagem("João", "Bom dia!!");

    notificacoes.enviarMensagem("Maria", "Atenção", 4);


}
