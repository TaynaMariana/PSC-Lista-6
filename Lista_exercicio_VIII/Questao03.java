import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numero = new double[3];

        System.out.println("Digite três numeros: ");
        for(int i = 0; i < 3; i++){
            numero[i] = scanner.nextDouble();
        }

        double soma = calcularSoma(numero);
        System.out.print("A soma dos números são: " + soma);

        scanner.close();
    }

    public static double calcularSoma(double[] vetor){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }
}