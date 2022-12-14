public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    public Funcionario() {
        
    }

    public Funcionario(String nome, String dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void getNome() {
        System.out.println("Nome: " + this.nome);
    }

    public void getDataNascimento() {
        System.out.println("Data de Nascimento: " + this.dataNascimento);
    }

    public void getSalario() {
        System.out.println("Salario: " + this.salario);
    }
}
