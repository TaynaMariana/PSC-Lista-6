import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Informe o " + (i+1) + "º número:");
            numeros[i] = scanner.nextDouble();
        }

        double maior = maiorNumero(numeros);

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }

    public static double maiorNumero(double[]array){
        double maior = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > maior){
                maior = array[i];
            }
        }
        return maior;
    }

}
