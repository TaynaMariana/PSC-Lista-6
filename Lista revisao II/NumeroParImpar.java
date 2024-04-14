import java.util.Scanner;

public class NumeroParImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro:");
        numero = scanner.nextInt();

        if(numero %2 == 0){
            System.out.println("Númro par");
        }
        else{
            System.out.println("Número impar");
        }
        scanner.close();
    }
}