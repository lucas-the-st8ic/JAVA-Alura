import alura.java.classes.metodos.Titulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(254);
        list.add(45);
        list.add(794);
        list.add(123);
        list.add(12435);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Titulos> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(new Titulos("Java"));
        listaDeTitulos.add(new Titulos("Python"));
        listaDeTitulos.add(new Titulos("C#"));
        listaDeTitulos.add(new Titulos("C++"));
        listaDeTitulos.add(new Titulos("Go"));

        Collections.sort(listaDeTitulos);

        System.out.println(listaDeTitulos);

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}