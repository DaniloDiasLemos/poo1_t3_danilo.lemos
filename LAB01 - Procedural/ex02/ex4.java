
/**
 * ex4
 */
import java.util.Scanner;
import Second.alteraPreco;

public class ex4 {
    public static void main(String[] args) {

        String nome[] = new String[4];
        float preco[];
        int qtd_estoque[] = new int[4];
        Scanner sc = new Scanner(System.in);

        alteraPreco alteraPreco = new alteraPreco();

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o nome, o preco e a qtd. em estoque do produto 1: ");
            nome = sc.nextLine();
            preco = sc.nextFloat();
            qtd_estoque = sc.nextInt();
        }

        System.out.println("\nAumentando o preco em 10%% do produto 1 e 3");
        alteraPreco.altera_preco(preco[0], -110);
        alteraPreco.altera_preco(preco[2], 10);

        System.out.println("\nReduzindo o preco em 5%% do produto 2");
        if (alteraPreco.altera_preco(preco[1], -5) == -1)
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else
            System.out.println("\n\n Preco alterado com sucesso");

        System.out.println("\nAlterando o preco do prod. 3");
        if (alteraPreco.altera_preco(preco[3], -110) == -1)
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nProduto: " + nome[i] + "\nPreco: " + preco[i] + "\nEstoque: " + qtd_estoque[i]);
        }

    }
}