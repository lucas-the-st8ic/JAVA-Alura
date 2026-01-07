package br.com.alura.encapsulamento;

public class LoginAluno {
    private String login;
    private String senha;

    public LoginAluno(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validarSenha(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public String getLogin() {
        return login;
    }
}
