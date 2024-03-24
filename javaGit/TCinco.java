package Repeticao51;

import java.util.Scanner;

public class TCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + limiteSuperior + ":");

        for (int numero = 2; numero <= limiteSuperior; numero++) {
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }
}
