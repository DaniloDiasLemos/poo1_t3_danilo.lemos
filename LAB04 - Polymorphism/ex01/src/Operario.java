public class Operario extends Funcionario {
    double valorProducao;
    int qtdProduzida;

    public Operario(String nome, String dataNascimento, double salario, double valorProducao, int qtdProduzida){
        super(nome, dataNascimento, salario);
        this.valorProducao = valorProducao;
        this.qtdProduzida = qtdProduzida;
    }
    
}
