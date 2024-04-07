import java.util.Scanner;

public class Questao04 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        char[] caractere = new char[10];
        
        System.out.println("Digite 10 caracteres: ");

        for(int i = 0; i < caractere.length; i++){
            System.out.print(i + 1 + ": ");
            caractere[i] = scanner.next().charAt(0);
        }

        int consoantes = 0;
        System.out.println("Consoantes digitadas: ");

        for(char c : caractere){
            if(Character.isLetter(c) && !isVowel(c)){
                consoantes++;
                System.out.println(c);
            }
        }

        System.out.println("Total de consoantes lidas: " + consoantes);
        scanner.close();
    }

    //função para verificar se um caractere é uma vogal
    private static boolean isVowel(char c){
        c = Character.toUpperCase(c);
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    
}
