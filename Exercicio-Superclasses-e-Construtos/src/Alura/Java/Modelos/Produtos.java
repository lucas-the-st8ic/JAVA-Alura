package Alura.Java.Modelos;

public class Produtos {
    private String nomeDoProduto;
    private double quantidadeDoProduto;
    private Double precoDoProduto;



    public Produtos(String nomeDoProduto, double quantidadeDoProduto, Double precoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.quantidadeDoProduto = quantidadeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

    public void setQuantidadeDoProduto(double quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    public Double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(Double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeDoProduto + "\nPreço: R$" + precoDoProduto + "\nQuantidade: " + quantidadeDoProduto;
    }
}
