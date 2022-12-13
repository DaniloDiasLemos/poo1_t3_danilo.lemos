public class Figurinha {
    private String nomeJogador;
    private String nascimentoJogador;
    private float alturaJogador;
    private float pesoJogador;
    private String posicaoJogador;
    private String paisJogador;

    public Figurinha(String nomeJogador, String nascimentoJogador, float alturaJogador, float pesoJogador,
            String posicaoJogador, String paisJogador) {

        this.nomeJogador = nomeJogador;
        this.nascimentoJogador = nascimentoJogador;
        this.alturaJogador = alturaJogador;
        this.pesoJogador = pesoJogador;
        this.posicaoJogador = posicaoJogador;
        this.paisJogador = paisJogador;
    }

    public void showFigurinha() {
        System.out.println("nomeJogador: " + nomeJogador);
        System.out.println("nascimentoJogador: " + nascimentoJogador);
        System.out.println("alturaJogador: " + alturaJogador);
        System.out.println("pesoJogador: " + pesoJogador);
        System.out.println("posicaoJogador" + posicaoJogador);
        System.out.println("paisJogador: " + paisJogador);

    }

}
