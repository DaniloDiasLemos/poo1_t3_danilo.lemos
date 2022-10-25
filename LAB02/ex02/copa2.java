package LAB02.ex02;

import java.time.LocalDate;

public class copa2 {
    public static void main(String[] args) {
        Figurinha2 jog1 = new Figurinha2();

        jog1.setName("Pele");
        jog1.setData(LocalDate.parse("1879-03-12"));
        jog1.setAltura(1.75F);
        jog1.setPeso(70.4F);
        jog1.setPosicao("Atacante");
        jog1.setPais("Brasil");

        jog1.showJogador();
    }
}
