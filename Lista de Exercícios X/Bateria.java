public class Bateria {

    private String tipo;
    private int capacidade;
    private int voltagem;
    private String marca;

    public Bateria(String tipo, int capacidade, int voltagem, String marca){
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.voltagem = voltagem;
        this.marca = marca;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getVoltagem(){
        return voltagem;
    }

    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void fornecer(){
        System.out.println("Fornecendo energia!");
    }

    public void recarregar(){
        System.out.println("Recarregando a bateria!");
    }

    public void descarregar(){
        System.out.println("Descarregando a bateria!");
    }

    public void armazenar(){
        System.out.println("Armazenando energia!");
    }
}