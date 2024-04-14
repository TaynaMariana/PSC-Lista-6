import java.util.Scanner;
public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario, impostoRenda;

        System.out.println("Informe o salário: ");
        salario = scanner.nextDouble();
        impostoRenda = calculoImpostoRenda(salario);

        String impostoFormatado = String.format("%.2f", impostoRenda);
        System.out.println("O imposto de renda a ser pago é: R$" + impostoFormatado);

        scanner.close();
    }

    public static double calculoImpostoRenda(double salario){
        double imposto;

        if (salario <= 2259.20) {
            imposto = 0.0;
        }
        else if (salario >= 2259.21 && salario <= 2826.65) {
            imposto = (salario * 7.5) / 100;
        } 
        else if (salario >= 2826.66 && salario <= 3751.05) {
            imposto = (salario * 15) / 100;
        } 
        else if (salario >= 3751.06 && salario <= 4664.68) {
            imposto = (salario * 22.5) / 100;
        } 
        else {
            imposto = (salario * 27.5) / 100;
        }

        return imposto;
    }
}
