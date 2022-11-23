package LAB03.ex03;

public class Main {

    public static void main(String[] args) {
        Figurinha figurinha = new Figurinha("Ronaldo", "10/12/1889", 1.70F, 80F, "atacante", "Brasil");
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Rogerio", "10/12/1889", 1.70F, 80F, "atacante", "Brasil", "ouro", "Legend");

        figurinha.showFigurinha();

        System.out.println("");

        figurinhaExtra.showFigurinhaExtra();

        
    }
    
}
