public class Regua {

    private String material;
    private int comprimento;
    private String design;

    public Regua(String material, int comprimento, String design){
        this.material = material;
        this.comprimento = comprimento;
        this.design = design;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getComprimento(){
        return comprimento;
    }

    public void setCoMprimento(int comprimento){
        this.comprimento = comprimento;
    }

    public String getDesign(){
        return design;
    }

    public void setDesign(String design){
        this.design = design;
    }

    public void medir(){
        System.out.println("Usada para medir o tamanho!");
    }

    public void tracar(){
        System.out.println("Usada para traçar!");
    }

    public void alinhar(){
        System.out.println("Usada para alinhar!");
    }

}