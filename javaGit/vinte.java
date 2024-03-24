import java.util.Scanner;

public class vinte{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;
        do {
            int numero;
            do {
                System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
                numero = scanner.nextInt();
            } while (numero < 0 || numero >= 16);

            int fatorial = calcularFatorial(numero);

            System.out.println(numero + "! = " + fatorial);

            System.out.print("Deseja calcular o fatorial de outro número? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }

    public static int calcularFatorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
