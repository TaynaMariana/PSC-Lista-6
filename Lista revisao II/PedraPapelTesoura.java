import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] opcoes = {"pedra", "papel", "tesoura"};
        
        System.out.print("Escolha pedra, papel ou tesoura: ");
        String escolhaJogador = scanner.next().toLowerCase();
        
        int indexEscolhaComputador = random.nextInt(opcoes.length);
        String escolhaComputador = opcoes[indexEscolhaComputador];
        
        System.out.println("Você escolheu: " + escolhaJogador);
        System.out.println("O computador escolheu: " + escolhaComputador);
        
        if (escolhaJogador.equals(escolhaComputador)) {
            System.out.println("Empate!");
        } else if ((escolhaJogador.equals("pedra") && escolhaComputador.equals("tesoura")) ||
                   (escolhaJogador.equals("papel") && escolhaComputador.equals("pedra")) ||
                   (escolhaJogador.equals("tesoura") && escolhaComputador.equals("papel"))) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }
        
        scanner.close();
    }
}

