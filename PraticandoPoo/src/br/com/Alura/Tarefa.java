package br.com.Alura;

import java.util.Scanner;

public class Tarefa {
    private String nomeDaTarefa;
    private String descricao;
    private boolean statusTarefa;

    public String getNomeDaTarefa() {
        return nomeDaTarefa;
    }


    public String getDescricao() {
        return descricao;
    }

    public boolean isStatusTarefa() {
        return statusTarefa;
    }


    public void preencherDados() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um título para a tarefa: ");
        nomeDaTarefa = input.nextLine();
        System.out.print("==============================\n");

        System.out.println("Agora digite uma descrição para esta tarefa: ");
        descricao = input.nextLine();

        System.out.println("!!Digite apenas(Sim) ou (Não)!!");
        System.out.println("A tarefa está concluída?: ");
        String resposta = input.nextLine();

        while(true) {
            if (resposta.equalsIgnoreCase("sim")) {
                statusTarefa = true;
                break;
            } else if (resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não")) {
                statusTarefa = false;
                break;
            } else {
                System.out.println("!!!OPÇÃO INVALIDA!!!");
                System.out.println("!!Digite apenas(Sim) ou (Não)!!");
                System.out.println("A tarefa está concluída?: ");
                resposta = input.nextLine();
            }
        }
    }


    @Override
    public String toString() {
        String statusDaTarefa = statusTarefa? "Concluído" : "Pendente";

        return "Tarefa: " +nomeDaTarefa+
                "\nDescrição da tarefa: " +descricao+
                "\nStatus da tarefa: " +statusDaTarefa+ "\n==========";

    }
}
