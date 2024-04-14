import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorProduto, porcentagemDesconto, desconto, valorFinal;

        System.out.println("Digite o valor do produto:");
        valorProduto = scanner.nextDouble();

        System.out.println("Digite a porcentagem do desconto (%)");
        porcentagemDesconto = scanner.nextDouble();

        desconto = (porcentagemDesconto / 100) * valorProduto;

        valorFinal = valorProduto - desconto;

        System.out.println("O valor do produto com desconto é de: R$" + valorFinal);

        scanner.close();
    }
}
