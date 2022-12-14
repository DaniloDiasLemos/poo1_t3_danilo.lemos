public class Empresa {
    public static void main(String[] args) throws Exception {
        Funcionario[] funcionarios = new Funcionario[4];
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        funcionarios[0] = new Chefe("chefe", "10/12/1998", 10000, 5000, 5000);
        funcionarios[1] = new Vendedor("vendedor", "10/10/2000", 4000, 3000, 100, 10);
        funcionarios[2] = new Operario("operario", "12/01/1890", 5000, 500, 10);
        funcionarios[3] = new Horista("horista", "01/01/1990", 3000, 300, 10);

        folhaPagamento.showFolhaPagamento(funcionarios);

    }
}
