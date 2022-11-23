package LAB03.ex04;

public class C3 extends C2 {
    public String rg;
    private String cpf;
    protected String cartao;

    public C3() {
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(String rg, String cpf, String cartao) {
        this.rg = rg;
        this.cpf = cpf;
        this.cartao = cartao;

        System.out.println("Classe C3: chamada do construtor com parametros");
    }

    public C3(String rg, String cpf, String cartao, String cidade, String bairro, String rua) {

        super(cidade, bairro, rua);
        this.rg = rg;
        this.cpf = cpf;
        this.cartao = cartao;

        System.out.println("Classe C3: chamada do construtor com parametros, chamada do construtor com parametros C2");

    }

}
