package LAB03.ex02;

public class Figurinha {
    protected String nomeJogador;
    protected String nascimentoJogador;
    protected float alturaJogador;
    protected float pesoJogador;
    protected String posicaoJogador;
    protected String paisJogador;


    public Figurinha(String nomeJogador, String nascimentoJogador, float alturaJogador, float pesoJogador, String posicaoJogador, String paisJogador) {

        this.nomeJogador = nomeJogador;
        this.nascimentoJogador = nascimentoJogador;
        this.alturaJogador = alturaJogador;
        this.pesoJogador = pesoJogador;
        this.posicaoJogador = posicaoJogador;
        this.paisJogador = paisJogador;
    }


    public void showFigurinha(){
        System.out.println("nomeJogador: " + nomeJogador);
        System.out.println("nascimentoJogador: " + nascimentoJogador);
        System.out.println("alturaJogador: " + alturaJogador);
        System.out.println("pesoJogador: " + pesoJogador);
        System.out.println("posicaoJogador" + posicaoJogador);
        System.out.println("paisJogador: " + paisJogador);

    }

}
