package Repeticao51;

import java.util.Scanner;

public class QNove {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (n): ");
        int n = scanner.nextInt();

        double soma = 0.0;
        int numerador = 1;
        int denominador = 1;

        System.out.print("S = ");
        for (int i = 1; i <= n; i++) {
            soma += (double) numerador / denominador;

            if (i < n) {
                System.out.print(numerador + "/" + denominador + " + ");
            } else {
                System.out.print(numerador + "/" + denominador);
            }

            numerador++;
            denominador += 2;
        }

        System.out.println();
        System.out.println("Soma da série: " + soma);

        scanner.close();
    }
}
