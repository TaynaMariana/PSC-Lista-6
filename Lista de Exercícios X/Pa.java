public class Pa {

    private String material;
    private int tamanho;

    public Pa(String material, int tamanho){
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public void escavar(){
        System.out.println("Escavando com a pá.");
    }

    public void transportar(){
        System.out.println("Transportando com a pá.");
    }
}