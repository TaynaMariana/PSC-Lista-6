import java.util.Scanner;

public class Questao01{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int [] numero = new int[5];
        System.out.println("Informe os 5 números inteiros");
        for(int i = 0; i < numero.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = scanner.nextInt();
        }
        System.out.println("Os números digitados foram: ");
        for(int i = 0; i < numero.length; i++){
            System.out.println(numero[i]);
        }

        scanner.close();
    }
}