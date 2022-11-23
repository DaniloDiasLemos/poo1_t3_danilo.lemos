public class FigurinhaExtra {
    private String nomeJogador;
    private String nascimentoJogador;
    private float alturaJogador;
    private float pesoJogador;
    private String posicaoJogador;
    private String paisJogador;
    private String variacao;
    private String categoria;

    public FigurinhaExtra(String nomeJogador, String nascimentoJogador, float alturaJogador, float pesoJogador,
            String posicaoJogador, String paisJogador, String varicao, String categoria) {

        this.nomeJogador = nomeJogador;
        this.nascimentoJogador = nascimentoJogador;
        this.alturaJogador = alturaJogador;
        this.pesoJogador = pesoJogador;
        this.posicaoJogador = posicaoJogador;
        this.paisJogador = paisJogador;
        this.variacao = varicao;
        this.categoria = categoria;
    }

    public void showFigurinhaExtra() {
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
