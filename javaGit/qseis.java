import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> saltos = new ArrayList<>();

        while (true) {
            System.out.print("Nome do atleta: ");
            String nome = scanner.nextLine();

            if (nome.isEmpty()) {
                break; 
            }

            System.out.println("\nInforme as distâncias alcançadas nos cinco saltos:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Salto " + (i + 1) + ": ");
                double distancia = scanner.nextDouble();
                saltos.add(distancia);
            }
            scanner.nextLine();

            double melhorSalto = Double.MIN_VALUE;
            double piorSalto = Double.MAX_VALUE;
            double somaSaltos = 0;
            for (double salto : saltos) {
                if (salto > melhorSalto) {
                    melhorSalto = salto;
                }
                if (salto < piorSalto) {
                    piorSalto = salto;
                }
                somaSaltos += salto;
            }

            double mediaDemaisSaltos = (somaSaltos - melhorSalto - piorSalto) / 3;

            System.out.println("\nResultado final:");
            System.out.println(nome + ": " + String.format("%.1f", mediaDemaisSaltos) + " m\n");

            saltos.clear();
        }

        scanner.close();
    }
}
