package Repeticao51;

import java.util.Scanner;

public class TTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaTemperaturas = 0;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;
        int contador = 0;

        System.out.println("Digite as temperaturas (digite 0 para encerrar):");

        while (true) {
            System.out.print("Temperatura " + (contador + 1) + ": ");
            double temperatura = scanner.nextDouble();

            if (temperatura == 0) {
                break; // Se o usuário digitar 0, encerra o loop
            }

            somaTemperaturas += temperatura;

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }

            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhuma temperatura foi inserida.");
        } else {
            double mediaTemperaturas = somaTemperaturas / contador;

            System.out.println("Menor temperatura: " + menorTemperatura);
            System.out.println("Maior temperatura: " + maiorTemperatura);
            System.out.println("Média das temperaturas: " + mediaTemperaturas);
        }

        scanner.close();
    }
}
