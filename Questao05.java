import java.util.Scanner;

public class Questao05 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPar = 0, contadorImpar = 0;

        System.out.println("Informe os 20 números inteiros");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
            if (numeros[i] %2 == 0) {
                pares[contadorPar] = numeros[i];
                contadorPar++;
            }
            else{
                impares[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }

        System.out.println("\nNúmeros digitados: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNúmeros pares: ");
        for(int i = 0; i < contadorPar; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nNúmeros impares: ");
        for(int i = 0; i < contadorImpar; i++){
            System.out.print(impares[i] + " ");
        }

        scanner.close();
    }
    
}
