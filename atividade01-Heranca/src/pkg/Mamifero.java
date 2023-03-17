package pkg;

public class Mamifero extends Animal {
    private String alimento;

    // Método construtor que recebe os valores iniciais de todos os atributos
    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    // Métodos get e set para o atributo alimento
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Método dadosMamifero que imprime os atributos do mamifero
    public void dadosMamifero() {
        super.dados(); // Chama o método dados da classe Animal para imprimir os atributos do animal
        System.out.println("Alimento: " + alimento);
    }
}

