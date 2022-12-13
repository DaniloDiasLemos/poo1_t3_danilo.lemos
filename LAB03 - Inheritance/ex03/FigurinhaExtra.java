package LAB03.ex03;

public class FigurinhaExtra extends Figurinha {
    
    private String variacao;
    private String categoria;


    public FigurinhaExtra(String nomeJogador, String nascimentoJogador, float alturaJogador, float pesoJogador, String posicaoJogador, String paisJogador, String varicao, String categoria) {

        super(nomeJogador, nascimentoJogador, alturaJogador, pesoJogador, posicaoJogador, paisJogador);
        this.variacao = varicao;
        this.categoria = categoria;
    }

    public void showFigurinhaExtra(){
        super.showFigurinha();
        System.out.println("variacao: " + variacao);
        System.out.println("categoria: " + categoria);

    }
}
