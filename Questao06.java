import java.util.Scanner;

public class Questao06 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        final int NUM_ALUNOS = 10;
        double[] medias = new double[NUM_ALUNOS];
        int contador = 0;

        for(int i = 0; i < NUM_ALUNOS; i++){
            System.out.println("Aluno " + (i+1) + ": ");
            double soma = 0;

            for(int j = 0; j < 4; j++){
                System.out.print("Nota " + (j+1) + ": ");
                double nota = scanner.nextDouble();
                soma += nota;
            }

            double media = soma / 4;
            medias[i] = media;

            if(media >= 7.0){
                contador++;
            }
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + contador);

        scanner.close();
    }
    
}
