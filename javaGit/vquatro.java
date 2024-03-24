import java.util.Scanner;

public class vquatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de notas: ");
        int n = scanner.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / n;
        
        System.out.println("A média aritmética das " + n + " notas é: " + media);

        scanner.close();
    }
}

