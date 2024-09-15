package br.com.fatec.problema.terceiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeCaso;
        int numeroUm, numeroDois;
        String letra;

        quantidadeCaso = leitor.nextInt();

        for (int i = 0; i < quantidadeCaso; i++) {
            numeroUm = leitor.nextInt();
            leitor.nextLine();
            letra = leitor.nextLine();
            numeroDois = leitor.nextInt();


            if (letra.equals(letra.toUpperCase()) && numeroUm != numeroDois)
                System.out.println(numeroDois - numeroUm);
            else if (letra.equals(letra.toLowerCase()) && numeroUm != numeroDois)
                System.out.println(numeroDois + numeroUm);
            else if (numeroUm == numeroDois)
                System.out.println(numeroUm * numeroDois);
        }
    }
}
