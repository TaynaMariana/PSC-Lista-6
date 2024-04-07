import java.util.Scanner;

public class Questao03 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;
    
        System.out.println("Informe as 4 notas: ");
        for(int i = 0; i < notas.length; i++){
            System.out.print(i + 1 + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma/4;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.print("A média das notas são: " + media);

        scanner.close();
    }
    
}
