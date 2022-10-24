package LAB02.ex01;

import java.time.LocalDate;

public class copa {
    public static void main(String[] args) {
        Figurinha jog1 = new Figurinha();

        jog1.nomeJogador = "Pele";
        jog1.dataNascimento = LocalDate.parse("1879/03/12");
        jog1.altura = 1.67F;
        jog1.peso = 70.5F;
        jog1.posicao = "atacante";
        jog1.pais = "Brasil";

        Figurinha jog2 = new Figurinha();

        jog1.nomeJogador = "Ronaldo";
        jog1.dataNascimento = LocalDate.parse("1990/10/08");
        jog1.altura = 1.70F;
        jog1.peso = 80.6F;
        jog1.posicao = "Volante";
        jog1.pais = "Brasil";

        Figurinha jog3 = new Figurinha();

        jog1.nomeJogador = "Rivaldo";
        jog1.dataNascimento = LocalDate.parse("1890/09/01");
        jog1.altura = 1.75F;
        jog1.peso = 60.5F;
        jog1.posicao = "Zagueiro";
        jog1.pais = "Brasil";
    }
}
