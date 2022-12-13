package LAB03.ex04;

public class C2 extends C1{
    public String rua;
    private String bairro;
    protected String cidade;

    public C2(){

        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");

    }

    public C2(String rua, String bairro, String cidade){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;

        System.out.println("Classe C2: chamada do construtor com parametros");

    }
    
    
}
