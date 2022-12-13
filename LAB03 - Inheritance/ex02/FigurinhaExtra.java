package LAB03.ex02;

public class FigurinhaExtra extends Figurinha {
    
    private String variacao;
    private String categoria;


    public FigurinhaExtra(String nomeJogador, String nascimentoJogador, float alturaJogador, float pesoJogador, String posicaoJogador, String paisJogador, String varicao, String categoria) {

        super(nomeJogador, nascimentoJogador, alturaJogador, pesoJogador, posicaoJogador, paisJogador);
        this.variacao = varicao;
        this.categoria = categoria;
    }

    public void showFigurinhaExtra(){
        System.out.println("nomeJogador: " + nomeJogador);
        System.out.println("nascimentoJogador: " + nascimentoJogador);
        System.out.println("alturaJogador: " + alturaJogador);
        System.out.println("pesoJogador: " + pesoJogador);
        System.out.println("posicaoJogador" + posicaoJogador);
        System.out.println("paisJogador: " + paisJogador);
        System.out.println("variacao: " + variacao);
        System.out.println("categoria: " + categoria);

    }
}
