package LAB02.ex02;

import java.time.LocalDate;

public class Figurinha2 {
    String nomeJogador;
    LocalDate dataNascimento;
    float altura;
    float peso;
    String posicao;
    String pais;

    public Figurinha2() {
        
    }

    public void setName(String name) {
        this.nomeJogador = name;
    }

    public void setData(LocalDate data) {
        this.dataNascimento = data;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void showJogador() {
        System.out.println("Nome: " + nomeJogador);
        System.out.println("Data nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posicao: " + posicao);
        System.out.println("Pais: " + pais);
    }
}
