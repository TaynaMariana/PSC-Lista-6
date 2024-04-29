public class Mesa {
    private String tamanho;
    private String material;
    private String cor;
    private String design;

    public Mesa(String tamanho, String material, String cor, String design) {
        this.tamanho = tamanho;
        this.material = material;
        this.cor = cor;
        this.design = design;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void apoiar() {
        System.out.println("A mesa está apoiando objetos.");
    }

    public void organizar() {
        System.out.println("Organizando objetos sobre a mesa.");
    }

    public void decorar() {
        System.out.println("Decorando a mesa com objetos decorativos.");
    }

    public void reunir() {
        System.out.println("Reunindo pessoas em volta da mesa.");
    }
}