import java.util.Scanner;

public class Questao02 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double [] numero = new double[5];
        System.out.println("Informe os 5 números inteiros");
        for(int i = 0; i < numero.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = scanner.nextDouble();
        }
        System.out.println("Os números digitados na ordem inversa: ");
        for(int i = numero.length - 1; i >= 0; i--){
            System.out.println(numero[i]);
        }
        scanner.close();
    }
}
