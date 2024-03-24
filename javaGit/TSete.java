package Repeticao51;

import java.util.Scanner;

public class TSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = 0, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int quantidadeClientes = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para encerrar): ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a altura do cliente (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso do cliente (em kg): ");
            double peso = scanner.nextDouble();

            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                codigoMaisAlto = codigo;
            }

            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                codigoMaisBaixo = codigo;
            }

            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }

            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }

            somaAlturas += altura;
            somaPesos += peso;
            quantidadeClientes++;
        }

        if (quantidadeClientes > 0) {
            double mediaAlturas = somaAlturas / quantidadeClientes;
            double mediaPesos = somaPesos / quantidadeClientes;

            System.out.println("Cliente mais alto: Código " + codigoMaisAlto + ", Altura " + alturaMaisAlto + " metros");
            System.out.println("Cliente mais baixo: Código " + codigoMaisBaixo + ", Altura " + alturaMaisBaixo + " metros");
            System.out.println("Cliente mais gordo: Código " + codigoMaisGordo + ", Peso " + pesoMaisGordo + " kg");
            System.out.println("Cliente mais magro: Código " + codigoMaisMagro + ", Peso " + pesoMaisMagro + " kg");
            System.out.println("Média das alturas dos clientes: " + mediaAlturas + " metros");
            System.out.println("Média dos pesos dos clientes: " + mediaPesos + " kg");
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }

        scanner.close();
    }
}
