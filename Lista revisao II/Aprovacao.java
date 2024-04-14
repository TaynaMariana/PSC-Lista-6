import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        System.out.println("Digite a nota do aluno: ");
        nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("O aluno foi aprovado!");
        }
        else{
            System.out.println("O aluno foi reprovado!");
        }

        scanner.close();
    }
}
