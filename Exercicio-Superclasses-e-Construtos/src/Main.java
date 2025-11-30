import Alura.Java.Modelos.ProdPereciveis;
import Alura.Java.Modelos.Produtos;
import java.util.ArrayList;
public class Main {
    static void main(String[] args) {

        ArrayList<Produtos> listaProdutos = new ArrayList<>();

        Produtos produto_cod_01 = new Produtos("Shampoo Jacques Janine", 35, 49.90);
        Produtos produto_cod_02 = new Produtos("Lavitan A-Z", 5, 38.28);
        Produtos produto_cod_03 = new Produtos("Absorvente Intimus c/ abas duplas", 5, 9.98);
        //Produtos produto_cod_04 = new Produtos("Iogurte Grego Nestle", 10, 3.50);

        listaProdutos.add(produto_cod_01);
        listaProdutos.add(produto_cod_02);
        listaProdutos.add(produto_cod_03);


        System.out.println(listaProdutos);

        System.out.println(listaProdutos.get(0).toString());

        Produtos produto_cod_04 = new ProdPereciveis("Iogurte Grego Nestle", 10, 2.99, "2026-06-20");
        listaProdutos.add(produto_cod_04);

        System.out.println(listaProdutos.get(0).toString());
        System.out.println(listaProdutos.get(3).toString());


        }
    }


