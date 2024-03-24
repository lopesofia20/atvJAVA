import java.util.Scanner;

public class quinze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");
        for (int i = 1; i <= n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
