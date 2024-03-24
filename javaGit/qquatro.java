import java.util.Scanner;

public class qquatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votosCandidatos = new int[4]; 
        int votosNulos = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite o código do voto (ou 0 para encerrar): ");
            int codigoVoto = scanner.nextInt();

            if (codigoVoto == 0) {
                break; 
            }

            switch (codigoVoto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[codigoVoto - 1]++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                default:
                    System.out.println("Código de voto inválido. Voto não computado.");
            }

            totalVotos++; 
        }

        System.out.println("\nTotal de votos para cada candidato:");
        for (int i = 0; i < votosCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i]);
        }

 
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);

        double percentualNulos = (double) votosNulos / totalVotos * 100;
        System.out.println("Percentagem de votos nulos sobre o total de votos: " + percentualNulos + "%");

        double percentualEmBranco = (double) votosEmBranco / totalVotos * 100;
        System.out.println("Percentagem de votos em branco sobre o total de votos: " + percentualEmBranco + "%");

        scanner.close();
    }
}
