import java.text.DecimalFormat;
import java.util.Scanner;

public class qum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.print("Digite o valor da dívida: R$ ");
        double valorDivida = scanner.nextDouble();

        System.out.println("\nTabela de Pagamento:");
        System.out.println("Valor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");

        for (int parcelas : new int[]{1, 3, 6, 9, 12}) {
            double valorJuros = calcularJuros(valorDivida, parcelas);
            double valorParcela = calcularValorParcela(valorDivida, parcelas);
            double valorTotalDivida = valorDivida + valorJuros;

            System.out.println("R$ " + df.format(valorTotalDivida) + "\t\tR$ " + df.format(valorJuros) +
                    "\t\t\t" + parcelas + "\t\t\t\tR$ " + df.format(valorParcela));
        }

        scanner.close();
    }

    public static double calcularJuros(double valor, int parcelas) {
        double percentualJuros = 0;
        switch (parcelas) {
            case 3:
                percentualJuros = 0.10;
                break;
            case 6:
                percentualJuros = 0.15;
                break;
            case 9:
                percentualJuros = 0.20;
                break;
            case 12:
                percentualJuros = 0.25;
                break;
            default:
                break;
        }
        return valor * percentualJuros;
    }

    public static double calcularValorParcela(double valor, int parcelas) {
        return (valor + calcularJuros(valor, parcelas)) / parcelas;
    }
}
