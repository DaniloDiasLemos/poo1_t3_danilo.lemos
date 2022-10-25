package LAB02.ex03;

import java.time.LocalDate;

public class copa3 {
    public static void main(String[] args) {
        Figurinha3 [] jogador = new Figurinha3[3];

        for (int i = 0; i < jogador.length; i++) {
            jogador[i] = new Figurinha3();
        }

        jogador[0].setName("Pele");
        jogador[0].setData(LocalDate.parse("1879-03-12"));
        jogador[0].setAltura(1.67F);
        jogador[0].setPeso(78.5F);
        jogador[0].setPosicao("Atacante");
        jogador[0].setPais("Brasil");

        jogador[0].showJogador();

        jogador[1].setName("Ronaldo");
        jogador[1].setData(LocalDate.parse("1956-04-10"));
        jogador[1].setAltura(1.87F);
        jogador[1].setPeso(98.5F);
        jogador[1].setPosicao("Zaga");
        jogador[1].setPais("Brasil");

        jogador[1].showJogador();

        jogador[2].setName("Juninho");
        jogador[2].setData(LocalDate.parse("1999-01-04"));
        jogador[2].setAltura(1.57F);
        jogador[2].setPeso(55.5F);
        jogador[2].setPosicao("Goleiro");
        jogador[2].setPais("Brasil");

        jogador[2].showJogador();
    }
}
