public class Horista extends Funcionario {
    double valorHora;
    double totalHoras;

    public Horista(String nome, String dataNascimento, double salario, double valorHora, double totalHoras){
        super(nome, dataNascimento, salario);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }
}
