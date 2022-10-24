package produto;

/**
 * altera_preco
 */
public class Produto {

    public String nome;
    public float preco;
    public int qtd_estoque;


    public Produto(String n, float p, int q) {
        nome = n;
        preco = p;
        qtd_estoque = q;
    }
    public Produto() {
        nome = "";
        preco = 0;
        qtd_estoque = 0;
    }

    public int altera_preco(float porcentagem) {
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem / 100; // 10 >>> 1 + 10/100 = 1.1 ;; -5 =>> 1 + (-5/100) 0.95
            preco = temp; // preço modificado
            return 0;
        } else {
            return -1;
        }
    }
}