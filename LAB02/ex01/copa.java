package LAB02.ex01;

import java.time.LocalDate;

public class copa {
    public static void main(String[] args) {
        Figurinha jog1 = new Figurinha();

        jog1.nomeJogador = "Pele";
        jog1.dataNascimento = LocalDate.parse("1879-03-12");
        jog1.altura = 1.67F;
        jog1.peso = 70.5F;
        jog1.posicao = "atacante";
        jog1.pais = "Brasil";

        Figurinha jog2 = new Figurinha();

        jog2.nomeJogador = "Ronaldo";
        jog2.dataNascimento = LocalDate.parse("1990-10-08");
        jog2.altura = 1.70F;
        jog2.peso = 80.6F;
        jog2.posicao = "Volante";
        jog2.pais = "Brasil";

        Figurinha jog3 = new Figurinha();

        jog3.nomeJogador = "Rivaldo";
        jog3.dataNascimento = LocalDate.parse("1890-09-01");
        jog3.altura = 1.75F;
        jog3.peso = 60.5F;
        jog3.posicao = "Zagueiro";
        jog3.pais = "Brasil";
    }
}
