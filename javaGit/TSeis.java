package Repeticao51;

import java.util.Scanner;

public class TSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int numero = scanner.nextInt();

        System.out.print("Começar por: ");
        int inicio = scanner.nextInt();

        System.out.print("Terminar em: ");
        int fim = scanner.nextInt();

        if (fim < inicio) {
            System.out.println("Erro: O valor final não pode ser menor que o inicial.");
        } else {
            System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");

            for (int i = inicio; i <= fim; i++) {
                System.out.println(numero + " X " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}
