import java.util.Scanner;

public class doze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número para gerar a tabuada
        System.out.print("Digite um número entre 1 e 10 para gerar a tabuada: ");
        int numero = scanner.nextInt();

        // Verifica se o número está no intervalo válido
        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
        } else {
            // Gera e imprime a tabuada do número fornecido
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }

        scanner.close();
    }
}
