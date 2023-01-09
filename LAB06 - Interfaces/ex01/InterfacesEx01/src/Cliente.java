public class Cliente implements Classificavel {
    
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue(Classificavel o) {
        Cliente compara = (Cliente) o;
        if (this.nome.compareTo(compara.nome) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println("Nome: " + nome);
    }
}
