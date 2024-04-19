import java.util.Scanner;

public class Crime {

    public static boolean fazerPergunta(String pergunta) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(pergunta + " (sim ou não): ");
            String resposta = scanner.nextLine().toLowerCase();
            return resposta.equals("sim");
        }
    }

    public static void main(String[] args) {
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        int respostasPositivas = 0;
        for (String pergunta : perguntas) {
            if (fazerPergunta(pergunta)) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 5) {
            System.out.println("Você é classificado como Assassino.");
        } else if (respostasPositivas >= 3) {
            System.out.println("Você é classificado como Cúmplice.");
        } else if (respostasPositivas >= 2) {
            System.out.println("Você é classificado como Suspeito.");
        } else {
            System.out.println("Você é classificado como Inocente.");
        }
    }
}
