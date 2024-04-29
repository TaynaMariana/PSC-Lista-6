public class Cachorro {

    private String raca;
    private String nome;
    private int idade;
    private String cor;

    public Cachorro(String raca, String nome, int idade, String cor){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void latir(){
        System.out.println("Está latindo!");
    }

    public void correr(){
        System.out.println("Está correndo!");
    }

    public void brincar(){
        System.out.println("Está brincando!");
    }

    public void dormir(){
        System.out.println("Está dormindo!");
    }
}