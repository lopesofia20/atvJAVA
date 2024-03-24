import java.util.Scanner;

public class dezessete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número inteiro fornecido pelo usuário
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Calcula o fatorial do número fornecido
        int fatorial = calcularFatorial(numero);

        // Exibe o resultado
        System.out.println(numero + "! = " + fatorial);

        scanner.close();
    }

    // Método para calcular o fatorial de um número inteiro
    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int resultado = 1;
            for (int i = numero; i >= 1; i--) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
