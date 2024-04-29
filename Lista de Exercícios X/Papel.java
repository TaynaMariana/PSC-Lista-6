public class Papel {
    private String tipo;
    private String tamanho;
    private int gramatura;
    private String cor;

    public Papel(String tipo, String tamanho, int gramatura, String cor) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.gramatura = gramatura;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getGramatura() {
        return gramatura;
    }

    public void setGramatura(int gramatura) {
        this.gramatura = gramatura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void escrever() {
        System.out.println("Escrevendo no papel.");
    }

    public void rasgar() {
        System.out.println("Rasgando o papel.");
    }

    public void dobrar() {
        System.out.println("Dobrando o papel.");
    }

    public void recortar() {
        System.out.println("Recortando o papel.");
    }
}