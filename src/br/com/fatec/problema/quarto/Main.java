package br.com.fatec.problema.quarto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int hora;
        int minuto;
        int ocorrencia;
        int quantidadeCaso = 0;

        quantidadeCaso = leitor.nextInt();

        for (int i = 0; i < quantidadeCaso; i++) {
            hora = leitor.nextInt();
            minuto = leitor.nextInt();
            ocorrencia = leitor.nextInt();

            if (ocorrencia == 1 && hora >= 24) {
                int horaAjustada = 0;
                System.out.printf("%02d:%02d - A porta abriu!\n", horaAjustada, minuto);
            } else if (ocorrencia == 1 && hora < 24) {
                System.out.printf("%02d:%02d - A porta abriu!\n", hora, minuto);
            } else if (ocorrencia == 0 && hora >= 24) {
                int horaAjustada = 0;
                System.out.printf("%02d:%02d - A porta fechou!\n", horaAjustada, minuto);
            } else if (ocorrencia == 0 && hora < 24)
                System.out.printf("%02d:%02d - A porta fechou!\n", hora, minuto);
        }
    }
}