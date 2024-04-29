public class Carro {

    private String marca;
    private String cor;
    private int anoFabricacao;
    private String modelo;

    public Carro(String marca, String cor, int anoFabricacao, String modelo){
        this.marca = marca;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFavricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void dirigir(){
        System.out.println("Está sendo dirigido!");
    }

    public void abastecer(){
        System.out.println("Está sendo abastecido!");
    }

    public void estacionar(){
        System.out.println("Está sendo estacionado!");
    }

    public void limpar(){
        System.out.println("Está sendo limpo!");
    }
}