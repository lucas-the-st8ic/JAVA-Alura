package br.com.alura.encapsulamento;

public class Usuario {
    private  String login;
    private  String senha;
    private  String novaSenha;

    public Usuario(String login, String senha) {
        this.senha = senha;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
            System.out.println("Login: " + this.login);
            System.out.println("Senha alterada com sucesso");
        } else {
            System.out.println("Login: " +this.login);
            System.out.println("Senha atual incorreta. A senha não foi alterada!");
        }
    }
}
