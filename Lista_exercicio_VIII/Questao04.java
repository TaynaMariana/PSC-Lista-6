import java.util.Scanner;

public class Questao04 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        scanner.close();

        char resultado = verificarNumero(numero);
        System.out.println("O resultado é: " + resultado);
    }

    public static char verificarNumero(int num){
        if (num < 0) {
            return 'P';
        }
        else{
            return 'N';
        }
    }
}