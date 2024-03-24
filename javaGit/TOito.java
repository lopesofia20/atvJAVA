package Repeticao51;

import java.util.Scanner;

public class TOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário inicial do funcionário: ");
        double salarioInicial = scanner.nextDouble();

        int anoInicial = 1995;
        int anoAtual = 2022;
        double salarioAtual = salarioInicial;
        double percentualAumento = 0.015; // 1.5% em decimal

        for (int ano = anoInicial + 1; ano <= anoAtual; ano++) {
            salarioAtual += salarioAtual * percentualAumento; // Aumento do ano atual

            percentualAumento *= 2; // Dobrar o percentual de aumento para o próximo ano
        }

        System.out.println("O salário atual do funcionário em " + anoAtual + " é: R$ " + salarioAtual);

        scanner.close();
    }
}
