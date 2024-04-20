import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar;
        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();
            
            // Converte a hora
            String horaConvertida = converterPara12Horas(hora, minutos);
            
            // Imprime a hora convertida
            imprimirHoraConvertida(horaConvertida);
            
            System.out.print("Deseja continuar (S/N)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        
        scanner.close();
    }

    public static String converterPara12Horas(int hora, int minutos) {
        String periodo = (hora < 12) ? "A.M." : "P.M.";
        hora = (hora == 0 || hora == 12) ? 12 : hora % 12;
        
        return String.format("%d:%02d %s", hora, minutos, periodo);
    }
    
    public static void imprimirHoraConvertida(String horaConvertida) {
        System.out.println("Hora convertida: " + horaConvertida);
    }
}

