package br.com.Alura;

public class Produto {
    public String nomeProduto;
    public double precoProduto;
    public int quantidadeProduto;

    public void exibirProduto() {
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.printf("Preço do produto: R$ %.2f\n", precoProduto);
        System.out.println("Quantidade do produto: " + quantidadeProduto);
    }
}
