package Alura.Java.Modelos;

public class ProdPereciveis extends Produtos {

    String validadeDoProduto;


    public ProdPereciveis(String nomeDoProduto, int quantidadeDoProduto, double precoDoProduto, String validadeDoProduto) {
        super(nomeDoProduto, quantidadeDoProduto, precoDoProduto);
        this.validadeDoProduto = validadeDoProduto;
    }

    public String getValidadeDoProduto() {
        return validadeDoProduto;
    }

    public void setValidadeDoProduto(String validadeDoProduto) {
        this.validadeDoProduto = validadeDoProduto;
    }

    @Override
    public String toString() {
        return super.toString() + "Data de validade: " + validadeDoProduto;
    }
}
