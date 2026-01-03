package br.com.alura.encapsulamento;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;


    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void exibirInformacoesVeiculo() {
        System.out.println("Veículo Cadastrado:");
        System.out.println("Modelo: " +modelo);
        System.out.println("Placa: " +placa);
        System.out.println("Ano: " +ano);
    }
}
