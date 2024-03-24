package Repeticao51;

import java.util.Scanner;

public class TUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroProduto = 1;
        double totalCompra = 0.0;

        System.out.println("Lojas Tabajara");

        while (true) {
            System.out.print("Produto " + numeroProduto + ": R$ ");
            double precoProduto = scanner.nextDouble();
            
            if (precoProduto == 0) {
                break; // Se o preço for zero, encerra a compra
            }

            totalCompra += precoProduto;
            numeroProduto++;
        }

        System.out.println("Total: R$ " + String.format("%.2f", totalCompra));

        System.out.print("Dinheiro: R$ ");
        double dinheiro = scanner.nextDouble();

        double troco = dinheiro - totalCompra;
        System.out.println("Troco: R$ " + String.format("%.2f", troco));

        scanner.close();
    }
}
