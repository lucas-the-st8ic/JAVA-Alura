package br.com.alura.encapsulamento;

public class Bateria {
    private double nivelBateria;

    public void setNivelBateria(double nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        }
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public String exibeNivelBateria() {
        if (nivelBateria <= 20) {
            return "Bateria fraca";
        } else if (nivelBateria <= 80) {
            return "Bateria ok";
        } else {
            return "Bateria cheia";
        }
    }
}
