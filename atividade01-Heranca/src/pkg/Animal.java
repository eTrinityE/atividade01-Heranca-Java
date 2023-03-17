package pkg;

public class Animal {
    String nome, cor, ambiente;
    Float comprimento, velMedia;
    Integer nroPatas;

    public Animal(String nome, float comprimento, int nroPatas, String cor, String ambiente, float velMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.nroPatas = nroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velMedia = velMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public Float getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(Float velMedia) {
        this.velMedia = velMedia;
    }

    public Integer getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(Integer nroPatas) {
        this.nroPatas = nroPatas;
    }

    public void dados() {
        System.out.println("Nome: " + getNome() + " Cor: " + getCor() + " Ambiente: " + getAmbiente() + " Comprimento " + getComprimento() + " Velocidade média: " + getVelMedia() + " Número patas: " + getNroPatas());
    }
}
