import java.util.Scanner;

public class qcinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gabarito = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};

        int maiorAcerto = 0;
        int menorAcerto = 10;
        int totalAlunos = 0;
        int totalPontos = 0;

        while (true) {
            System.out.println("Digite as respostas do aluno:");
            String[] respostas = new String[10];
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Resposta da questão " + (i + 1) + ": ");
                respostas[i] = scanner.nextLine().toUpperCase(); 
            }

            int acertos = 0;
            for (int i = 0; i < 10; i++) {
                if (respostas[i].equals(gabarito[i])) {
                    acertos++;
                }
            }

            totalAlunos++;
            totalPontos += acertos;
            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            System.out.println("Acertos do aluno: " + acertos);

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }
        double mediaNotas = (double) totalPontos / totalAlunos;

        System.out.println("\nEstatísticas finais:");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotas);

        scanner.close();
    }
}
