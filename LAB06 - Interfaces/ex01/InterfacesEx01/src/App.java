import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Produto[] produtos = new Produto[3];
        Cliente[] clientes = new Cliente[3];
        Servico[] servicos = new Servico[3];
        Scanner sc = new Scanner(System.in);
        Classificador classificador = new Classificador();

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o codigo do " + (i+1) + "º produto: ");
            produtos[i] = new Produto(sc.nextInt());
        }

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Digite o nome do " + (i+1) + "º cliente: ");
            clientes[i] = new Cliente(sc.next());
        }

        for (int i = 0; i < servicos.length; i++) {
            System.out.println("Digite o preco do " + (i+1) + "º servico: ");
            servicos[i] = new Servico(sc.nextInt());
            
        }

        classificador.ordena(produtos);
        classificador.ordena(clientes);
        classificador.ordena(servicos);

        System.out.println(" ");
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].show();
        }
        System.out.println(" ");
        for (int i = 0; i < clientes.length; i++) {
            clientes[i].show();
        }
        System.out.println(" ");
        for (int i = 0; i < servicos.length; i++) {
            servicos[i].show();
        }
        System.out.println(" ");
    }
}
