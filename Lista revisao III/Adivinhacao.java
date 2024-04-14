import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        
        System.out.println("Bem-vindo ao jogo da adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        
        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativa(s)!");
            }
        } while (palpite != numeroAleatorio);
        
        scanner.close();
    }
}
