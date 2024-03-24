package Repeticao51;

import java.util.Scanner;

public class VOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidadeCDs = scanner.nextInt();

        double totalInvestido = 0;

        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Digite o valor investido no CD " + i + ": ");
            double valorCD = scanner.nextDouble();
            totalInvestido += valorCD;
        }

        double valorMedioPorCD = totalInvestido / quantidadeCDs;

        System.out.println("O valor total investido na coleção de CDs é: R$" + totalInvestido);
        System.out.println("O valor médio gasto em cada CD é: R$" + valorMedioPorCD);

        scanner.close();
    }
}
