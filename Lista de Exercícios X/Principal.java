import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a classe que deseja visualizar:");
        System.out.println("1. Carro");
        System.out.println("2. Cachorro");
        System.out.println("3. Pá");
        System.out.println("4. Régua");
        System.out.println("5. Piano");
        System.out.println("6. Bateria");
        System.out.println("7. Travesseiro");
        System.out.println("8. Cadeado");
        System.out.println("9. Papel");
        System.out.println("10. Mesa");
        System.out.println("11. Acessar todas as classes");

        int escolha = scanner.nextInt();
        System.out.println();

        switch(escolha){
            case 1:
                visualizarCarro();
                break;
            case 2: 
                visualizarCachorro();
                break;
            case 3:
                visualizarPa();
                break;
            case 4:
                visualizarRegua();
                break;
            case 5:
                visualizarPiano();
                break;
            case 6:
                visualizarBateria();
                break;
            case 7:
                visualizarTravesseiro();
                break;
            case 8:
                visualizarCadeado();
                break;
            case 9:
                visualizarPapel();
                break;
            case 10: 
                visualizarMesa();
                break;
            case 11:
                visualizarCarro();
                System.out.println();
                visualizarCachorro();
                System.out.println();
                visualizarPa();
                System.out.println();
                visualizarRegua();
                System.out.println();
                visualizarPiano();
                System.out.println();
                visualizarBateria();
                System.out.println();
                visualizarTravesseiro();
                System.out.println();
                visualizarCadeado();
                System.out.println();
                visualizarPapel();
                System.out.println();
                visualizarMesa();
                break;
            default:
                System.out.println("Escolha inválida!");
        }

        scanner.close();
    }

    public static void visualizarCarro(){

        //Classe Carro

        System.out.println("CLASSE CARRO");

        Carro carro = new Carro("Toyota", "Preto", 2020, "Corolla");

        System.out.println("Informações do carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Ano de fabricação: " + carro.getAnoFabricacao());
        System.out.println("Modelo: " + carro.getModelo());
        
        System.out.println();

        carro.dirigir();
        carro.abastecer();
        carro.estacionar();
        carro.limpar();
    }

    public static void visualizarCachorro(){
        
        //Classe Cachorro

        System.out.println("CLASSE CACHORRO");

        Cachorro cachorro = new Cachorro("Labrador Retriever", "Max", 2, "Amarelo");

        System.out.println("Informações do cachorro:");
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");
        System.out.println("Cor: " + cachorro.getCor());
        
        System.out.println();

        cachorro.latir();
        cachorro.correr();
        cachorro.brincar();
        cachorro.dormir();
    }

    public static void visualizarPa(){
        
        //Classe Pá

        System.out.println("CLASSE PÁ");

        Pa pa = new Pa("Aço", 30);

        System.out.println("Informações da pá:");
        System.out.println("Material: " + pa.getMaterial());
        System.out.println("Tamanho: " + pa.getTamanho());
    
        System.out.println();
        
        pa.escavar();
        pa.transportar();
    }

    public static void visualizarRegua(){
        
        //Classe Régua

        System.out.println("CLASSE RÉGUA");

        Regua regua = new Regua("Plástico", 30, "Transparente");

        System.out.println("Informações da régua:");
        System.out.println("Material: " + regua.getMaterial());
        System.out.println("Comprimento: " + regua.getComprimento());
        System.out.println("Design: " + regua.getDesign() );
        
        System.out.println();
        
        regua.medir();
        regua.tracar();
        regua.alinhar();
    }

    public static void visualizarPiano(){
        
        //Classe Piano

        System.out.println("CLASSE PIANO");

        Piano piano = new Piano("Grand Piano", "Acústico", "Ébano Polido", "Steinway & Sons");

        System.out.println("Informações do piano:");
        System.out.println("Modelo: " + piano.getModelo());
        System.out.println("Tipo: " + piano.getTipo());
        System.out.println("Acabamento: " + piano.getAcabamento());
        System.out.println("Marca: " + piano.getMarca());
        
        System.out.println();
        
        piano.tocar();
        piano.compor();
        piano.ensinar();
        piano.afinar();
    }

    public static void visualizarBateria(){
        
        //Classe Bateria

        System.out.println("CLASSE BATERIA");

        Bateria bateria = new Bateria("Bateria de carro", 45, 12, "Bosch");

        System.out.println("Informações da bateria:");
        System.out.println("Tipo: " + bateria.getTipo());
        System.out.println("Capacidade: " + bateria.getCapacidade());
        System.out.println("Voltagem: " + bateria.getVoltagem());
        System.out.println("Marca: " + bateria.getMarca());
        
        System.out.println();
        
        bateria.fornecer();
        bateria.recarregar();
        bateria.descarregar();
        bateria.armazenar();
    }

    public static void visualizarTravesseiro(){
        
        //Classe Travesseiro

        System.out.println("CLASSE TRAVESSEIRO");

        Travesseiro travesseiro = new Travesseiro("Algodão", "Médio");

        System.out.println("Informações do travesseiro:");
        System.out.println("Material: " + travesseiro.getMaterial());
        System.out.println("Tamanho: " + travesseiro.getTamanho());
        
        System.out.println();
        
        travesseiro.apoiar();
        travesseiro.aconchegar();
    }

    public static void visualizarCadeado(){
        
        //Classe Cadeado

        System.out.println("CLASSE CADEADO");
        
        Cadeado cadeado = new Cadeado("Combinação", "Pequeno", "Master Lock");

        System.out.println("Informações do cadeado:");
        System.out.println("Tipo: " + cadeado.getTipo());
        System.out.println("Tamanho: " + cadeado.getTamanho());
        System.out.println("Marca: " + cadeado.getMarca());
        
        System.out.println();
        
        cadeado.trancar();
        cadeado.abrir();
        cadeado.proteger();
    }

    public static void visualizarPapel(){
        
        //Classe Papel

        System.out.println("CLASSE PAPEL");

        Papel papel = new Papel("Sulfite", "A4", 75, "Branco");

        System.out.println("Informações do papel:");
        System.out.println("Tipo: " + papel.getTipo());
        System.out.println("Tamanho: " + papel.getTamanho());
        System.out.println("Gramatura: " + papel.getGramatura());
        System.out.println("Cor: " + papel.getCor());
        
        System.out.println();
        
        papel.escrever();
        papel.rasgar();
        papel.dobrar();
        papel.recortar();
    }

    public static void visualizarMesa(){
        
        //Classe Mesa

        System.out.println("CLASSE MESA");

        Mesa mesa = new Mesa("Grande", "Madeira", "Marrom", "Minimalista");

        System.out.println("Informações da mesa:");
        System.out.println("Tamanho: " + mesa.getTamanho());
        System.out.println("Material: " + mesa.getMaterial());
        System.out.println("Cor: " + mesa.getCor());
        System.out.println("Design: " + mesa.getDesign());
        
        System.out.println();
        
        mesa.apoiar();
        mesa.organizar();
        mesa.decorar();
        mesa.reunir();
    }
}