public class Piano {

    private String modelo;
    private String tipo;
    private String acabamento;
    private String marca;

    public Piano(String modelo, String tipo, String acabamento, String marca){
        this.modelo = modelo;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getAcabamento(){
        return acabamento;
    }

    public void setAcabamento(String acabamento){
        this.acabamento = acabamento;
    }

    public String getMarca(){
        return marca;
    }

    public void setMArca(String marca){
        this.marca = marca;
    }

    public void tocar(){
        System.out.println("Está sendo tocado uma bela melodia.");
    }

    public void compor(){
        System.out.println("Compondo uma nova música.");
    }

    public void ensinar(){
        System.out.println("Ensinando a tocar piano para os alunos.");
    }

    public void afinar(){
        System.out.println("Afinando as cordas do piano para garantir um som perfeito.");
    }
}