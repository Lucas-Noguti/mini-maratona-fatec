package br.com.fatec.problema.segundo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeCaso;
        int numeroX, numeroY;
        int resultadoX = 0;

        quantidadeCaso = leitor.nextInt();

        for (int i = 0; i < quantidadeCaso; i++) {
            numeroX = leitor.nextInt();
            numeroY = leitor.nextInt();

            for (int j = 0; j < numeroY; j++) {
                if (numeroX % 2 != 0) {
                    resultadoX = resultadoX + numeroX;
                    numeroX += 2;
                } else if (numeroX % 2 == 0) {
                    numeroX++;
                    resultadoX = resultadoX + numeroX;
                    numeroX += 2;
                }
            }

            System.out.println(resultadoX);
        }

    }
}
