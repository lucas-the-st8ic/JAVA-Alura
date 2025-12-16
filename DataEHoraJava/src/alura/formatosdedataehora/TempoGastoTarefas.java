package alura.formatosdedataehora;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TempoGastoTarefas {
    static void main(String[] args) {
        LocalTime horaInicioTarefa = LocalTime.of(07, 00);
        LocalTime horaFinalTarefa = LocalTime.of(19, 00);

        Duration tempoTotalTarefa = Duration.between(horaInicioTarefa, horaFinalTarefa);

        System.out.println("Diferença de tempo: " +tempoTotalTarefa.toHours()+ " horas e " +tempoTotalTarefa.toMinutesPart()+ " minutos.");

    }



}
