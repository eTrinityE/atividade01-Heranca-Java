import pkg.Animal;
import pkg.Mamifero;
import pkg.Peixe;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);
        meuAnimal.dados();
        System.out.println();
        Peixe meuPeixe = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5F, "Barbatanas e cauda");
        meuPeixe.dadosPeixe();
        System.out.println();
        Mamifero meuMamifero = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");
        meuMamifero.dadosMamifero();
    }

}