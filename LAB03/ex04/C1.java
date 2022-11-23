package LAB03.ex04;

public class C1 {
    public String nome;
    private int idade;
    protected double altura;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrao, sem paramentros");
    }

    public C1(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

        System.out.println("Classe C1: chamada do construtor com parametros");

    }

}
