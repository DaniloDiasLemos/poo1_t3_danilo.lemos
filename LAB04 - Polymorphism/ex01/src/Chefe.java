public class Chefe extends Funcionario {
    double salarioFixo;
    double salarioPredefinido;

    public Chefe (String nome, String dataNascimento, double salario, double salarioFixo, double salarioPredefinido) {
        super(nome, dataNascimento, salario);
        this.salarioFixo = salarioFixo;
        this.salarioPredefinido = salarioPredefinido;
    }
}
