package br.com.fatec.problema.quinto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int diaUm, diaDois, diaTres;

        diaUm = leitor.nextInt();
        diaDois = leitor.nextInt();
        diaTres = leitor.nextInt();
        leitor.nextLine();

        int deltaUmDois = diaDois - diaUm;
        int deltaDoisTres = diaTres - diaDois;

        if (diaUm > diaDois && diaDois <= diaTres) {
            System.out.println(":)");
        } else if (diaUm < diaDois && diaDois >= diaTres) {
            System.out.println(":(");
        }

        if (diaUm < diaDois && diaDois < diaTres) {
            if (deltaDoisTres < deltaUmDois) {
                System.out.println(":(");
            } else {
                System.out.println(":)");
            }
        }

        if (diaUm > diaDois && diaDois > diaTres) {
            if (deltaDoisTres > deltaUmDois) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }

        if (diaUm == diaDois) {
            if (diaDois < diaTres) {
                System.out.println(":)");
            } else if (diaDois > diaTres) {
                System.out.println(":(");
            }
        }
    }
}
