public class Main {

    public static void main(String[] args) {
        Figurinha figurinha = new Figurinha("Romario", "10/06/1956", 1.90F, 70F, "atacante", "Brasil");
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Pele", "10/12/1889", 1.70F, 80F, "meio", "Brasil", "ouro",
                "Legend");

        figurinha.showFigurinha();

        System.out.println("");

        figurinhaExtra.showFigurinhaExtra();

    }

}
