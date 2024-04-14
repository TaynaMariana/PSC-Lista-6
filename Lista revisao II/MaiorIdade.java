import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade:");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");            
        }
        else{
            System.out.println("Menor de idade");
        }
        scanner.close();
    }
}
