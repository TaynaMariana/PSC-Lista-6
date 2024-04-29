public class Travesseiro {

    private String material;
    private String tamanho;

    public Travesseiro(String material, String tamanho){
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public void apoiar(){
        System.out.println("O travesseiro está sendo usado para apoiar.");
    }

    public void aconchegar(){
        System.out.println("O travesseiro está aconchegando.");
    }
}