public class Cadeado {

    private String tipo;
    private String tamanho;
    private String marca;

    public Cadeado(String tipo, String tamanho, String marca){
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void trancar(){
        System.out.println("O cadeado foi trancado.");
    }

    public void abrir(){
        System.out.println("O cadeado foi aberto.");
    }

    public void proteger(){
        System.out.println("O cadeado está protegendo.!");
    }

}