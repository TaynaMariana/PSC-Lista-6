import java.util.Scanner;

public class Questao07 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];
        int soma = 0;
        int multiplicacao = 1;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < TAMANHO; i++) {
            soma += vetor[i];
            multiplicacao *= vetor[i];
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("Número " + (i + 1) + ": " + vetor[i]);
        }
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        scanner.close();
    }
    
}
