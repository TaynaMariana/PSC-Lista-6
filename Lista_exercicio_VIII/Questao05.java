import java.util.Scanner;

public class Questao05 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o custo do item: ");
        double custo = scanner.nextDouble();
        System.out.println("Digite a taxa de imposto (em porcentagem): ");
        double taxaImposto = scanner.nextDouble();
        scanner.close();

        custo = somaImposto(taxaImposto, custo);

        System.out.println("O custo do item, incluindo o imposto, é: " + custo);
    }

    public static double somaImposto(double taxaImposto, double custo){
        double imposto = custo * (taxaImposto / 100);
        return custo + imposto;
    }
}
