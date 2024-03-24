package Repeticao51;

import java.util.Scanner;

public class QSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do ginasta: ");
        String nomeGinasta = scanner.nextLine();

        double[] notas = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double melhorNota = notas[0];
        double piorNota = notas[0];
        double somaNotas = notas[0];

        for (int i = 1; i < 7; i++) {
            if (notas[i] > melhorNota) {
                melhorNota = notas[i];
            }

            if (notas[i] < piorNota) {
                piorNota = notas[i];
            }

            somaNotas += notas[i];
        }

        double media = (somaNotas - melhorNota - piorNota) / 5;

        System.out.println("\nResultado final:");
        System.out.println("Atleta: " + nomeGinasta);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.println("Média: " + String.format("%.2f", media));

        scanner.close();
    }
}
