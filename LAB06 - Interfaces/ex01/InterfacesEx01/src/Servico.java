public class Servico implements Classificavel {
    
    private int preco;

    public Servico(int preco) {
        this.preco = preco;
    }

    public boolean eMenorQue(Classificavel o) {
        Servico compara = (Servico) o;
        if (this.preco < compara.preco) {
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println("Preco: " + preco);
    }
}
