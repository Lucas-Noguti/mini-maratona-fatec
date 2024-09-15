package br.com.fatec.problema.primeiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        int quantidadePositivo = 0;
        int quantidadeNegativo = 0;

        for (int i = 0; i < 5; i++) {
            int valorDigitado = leitor.nextInt();

            if (valorDigitado == 0)
                quantidadePar++;
            else if (valorDigitado < 0 && valorDigitado % 2 == 0) {
                quantidadePar++;
                quantidadeNegativo++;
            } else if (valorDigitado < 0 && valorDigitado % 2 != 0) {
                quantidadeImpar++;
                quantidadeNegativo++;
            } else if (valorDigitado > 0 && valorDigitado % 2 == 0) {
                quantidadePar++;
                quantidadePositivo++;
            } else if (valorDigitado > 0 && valorDigitado % 2 != 0) {
                quantidadeImpar++;
                quantidadePositivo++;
            }
        }

        System.out.printf("""
                %d valor(es) par(es)
                %d valor(es) impar(es)
                %d valor(es) positivo(s)
                %d valor(es) negativo(s)
                """, quantidadePar, quantidadeImpar, quantidadePositivo, quantidadeNegativo);
    }
}
