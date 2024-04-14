import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println( numero + " x " + i + " = " + (numero*i));
        }
        scanner.close();
    }
}
