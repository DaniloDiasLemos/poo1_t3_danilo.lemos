public class Vendedor extends Funcionario {
    double valorFixo;
    double comissao;
    int vendas;

    public Vendedor(String nome, String dataNascimento, double salario, double valorFixo, double comissao, int vendas){
        super(nome, dataNascimento, salario);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }
}
