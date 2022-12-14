public class FolhaPagamento {
    

    public void showFolhaPagamento(Funcionario[] funcionarios){
        System.out.println("Folha de Pagamento dos Funcionarios: \n");
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionario " + (i+1) + ": ");
            funcionarios[i].getNome();
            funcionarios[i].getDataNascimento();
            funcionarios[i].getSalario();
            System.out.println();
        }
    }
}
