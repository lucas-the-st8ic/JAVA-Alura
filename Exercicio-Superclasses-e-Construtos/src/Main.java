import Alura.Java.Modelos.Produtos;
import java.util.ArrayList;

static void main(String[] args) {

    ArrayList<Produtos> listaProdutos = new ArrayList<>();

    Produtos produto_cod_01 = new Produtos("Shampoo Jacques Janine", 35,49.90);
    Produtos produto_cod_02 = new Produtos("Lavitan A-Z", 5, 38.28);
    Produtos produto_cod_03 = new Produtos("Absorvente Intimus c/ abas duplas", 5, 9.98);

    listaProdutos.add(produto_cod_01);
    listaProdutos.add(produto_cod_02);
    listaProdutos.add(produto_cod_03);

    System.out.println(listaProdutos);

    System.out.println(listaProdutos.get(0).toString());
}

