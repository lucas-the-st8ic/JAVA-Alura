package br.com.Alura;

public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    public String categoria;
    public int diasDeAtraso;
    double multaPorDia = 2.50;

    public void exibirInformacoesLivro() {
        System.out.println("\"" +titulo+ "\" de " +autor+ " com " +paginas+ " páginas.");
    }

    public void exibirMultaPorAtraso() {
        double totalMulta = diasDeAtraso * multaPorDia;
        System.out.println("Livro: " +titulo);
        System.out.printf("Multa por atraso de %s dias: R$%.2f%n", diasDeAtraso, totalMulta );

    }
}
