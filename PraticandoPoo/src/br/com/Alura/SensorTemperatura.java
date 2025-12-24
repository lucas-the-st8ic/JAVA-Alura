package br.com.Alura;

public class SensorTemperatura {
     public String local;
    public double temperatura;

    public void exibirRelatorio () {
        System.out.println("Sensor no local: " +local);
        System.out.printf("Temperatura: %.1f °C \n", temperatura);

        if (temperatura > 37.5) {
            System.out.println("\t!ALERTA!");
            System.out.println("Temperatura acima do limite!!");
        }
    }
}
