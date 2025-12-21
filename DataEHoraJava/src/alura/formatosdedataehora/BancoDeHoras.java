package alura.formatosdedataehora;

import java.text.Format;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BancoDeHoras {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalTime horarioDeEntrada;
        LocalTime horarioDeSaidaPrevisto;
        LocalTime horarioDeSaidaReal;
        int cargaHoraria;

        DateTimeFormatter formatacaoHorario = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        horarioDeEntrada = LocalTime.parse(input.next(), formatacaoHorario);

        System.out.print("Insira a carga horária diária: ");
        cargaHoraria = input.nextInt();

        System.out.print("Digite o horário de saída real (HH:mm): ");
        horarioDeSaidaReal = LocalTime.parse(input.next(), formatacaoHorario);

        horarioDeSaidaPrevisto = horarioDeEntrada.plusHours(cargaHoraria);

        System.out.println("Horário de entrada: " +horarioDeEntrada);
        System.out.println("Horário de saída previsto: " +horarioDeSaidaPrevisto);
        System.out.println("Horário de saída real: " +horarioDeSaidaReal);

        Duration diferenca = Duration.between(horarioDeSaidaPrevisto, horarioDeSaidaReal);
        long horasDeDuracao = diferenca.toHours();
        long minutosDeDuracao = diferenca.toMinutesPart();

        if(horasDeDuracao == 0 && minutosDeDuracao == 0 ) {
            System.out.println("Saldo de horas: 00:00");
        } else {
            String positivoOuNegativo;

            if (horasDeDuracao > 0 || minutosDeDuracao > 0 ) {
                positivoOuNegativo = "+";
                System.out.println("Saldo de horas positivo de: " +positivoOuNegativo+ " "
                        +Math.abs(horasDeDuracao)+ ":" +Math.abs(minutosDeDuracao)+ ".");
            } else {
                positivoOuNegativo = "-";
                System.out.println("Saldo de horas negativo de: " +positivoOuNegativo+ " "
                        +Math.abs(horasDeDuracao)+ ":" +Math.abs(minutosDeDuracao)+ ".");
            }

        }



    }
}
