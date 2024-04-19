import java.util.Scanner;

public class TemperaturaMes {
    public static String obterMesExtenso(int numeroMes) {
        String[] meses = {"1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril", "5 - Maio", "6 - Junho", "7 - Julho", "8 - Agosto", "9 - Setembro", "10 - Outubro", "11 - Novembro", "12 - Dezembro"};
        if (numeroMes >= 1 && numeroMes <= 12) {
            return meses[numeroMes - 1];
        }
        else{
            return "Mês inválido!";
        }
    }

    public static void mesesAcima(double[] temperaturas){
        double soma = 0;
        for(double temperatura : temperaturas){
            soma += temperatura;
        }
        double mediaAnual = soma / temperaturas.length;

        System.out.println("\nMédia anual das temperaturas: " + mediaAnual + "°C");
        System.out.println("Meses com temperaturas acima da média anual:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.println(obterMesExtenso(i + 1) + ": " + temperaturas[i] + "°C");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturasMensais = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média do mês " + obterMesExtenso(i + 1) + ": ");
            temperaturasMensais[i] = scanner.nextDouble();
        }

        mesesAcima(temperaturasMensais);
        scanner.close();
    }
}
