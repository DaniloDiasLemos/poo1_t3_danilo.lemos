package LAB01.ex02;
/**
 * ex2 - exemplo 4 clone
 */
import java.util.Scanner;

public class exemplo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto();

        System.out.println("Informe o nome, o preco e a qtd. em estoque do produto 1: ");
        p1.nome = sc.next();
        p1.preco = sc.nextFloat();
        p1.qtd_estoque = sc.nextInt();
        System.out.println("Informe o nome, o preco e a qtd. em estoque do produto 2: ");
        p2.nome = sc.next();
        p2.preco = sc.nextFloat();
        p2.qtd_estoque = sc.nextInt();
        System.out.println("Informe o nome, o preco e a qtd. em estoque do produto 3: ");
        p3.nome = sc.next();
        p3.preco = sc.nextFloat();
        p3.qtd_estoque = sc.nextInt();
        System.out.println("Informe o nome, o preco e a qtd. em estoque do produto 4: ");
        p4.nome = sc.next();
        p4.preco = sc.nextFloat();
        p4.qtd_estoque = sc.nextInt();

        sc.close();

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        p1.altera_preco(-110);
        p3.altera_preco(10);

        System.out.println("\nReduzindo o preco em 5% do produto 2");
        if (p2.altera_preco(-5) == -1)
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else
            System.out.println("\n\n Preco alterado com sucesso\n");

        System.out.println("\nAlterando o preco do prod. 3");
        if (p3.altera_preco(-110) == -1)
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.println("\nProdutos Cadastrados:\n");
        System.out.println("\nProduto: " + p1.nome + "\nPreco: "+ p1.preco + "\nEstoque: " + p1.qtd_estoque);
        System.out.println("\nProduto: " + p2.nome + "\nPreco: "+ p2.preco + "\nEstoque: " + p2.qtd_estoque);
        System.out.println("\nProduto: " + p3.nome + "\nPreco: "+ p3.preco + "\nEstoque: " + p3.qtd_estoque);
        System.out.println("\nProduto: " + p4.nome + "\nPreco: "+ p4.preco + "\nEstoque: " + p4.qtd_estoque);

    }
}