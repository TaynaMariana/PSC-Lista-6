import java.util.Scanner;



public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        String texto = scanner.nextLine();

        if (ehPalindromo(texto)) {
            System.out.println("A string \"" + texto + "\" é um palíndromo.");
        } else {
            System.out.println("A string \"" + texto + "\" não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean ehPalindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Verificar se a string é um palíndromo
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

