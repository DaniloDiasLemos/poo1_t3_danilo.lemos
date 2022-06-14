#include <Funcionarios.h>
#include <Produtos.h>
#include <Clientes.h>
#include <String.h>

typedef struct Funcionarios funcionarios
{
    int cpf;
    char nome[100];
    char data_nasc[15];
    char data_ingresso[15];
};

Funcionarios *cadastrar_funcionario(int cpf, char n[100], char data[100], char data_in[100])
{

    Funcionarios *f;

    f = (Funcionarios *) malloc(1 * sizeof(Funcionarios));

    if (f != NULL)
    {
        f->cpf = cpf;
        f->nome = n;
        f->data_nasc = data;
        f->data_ingresso = data_in;
    }

    return f;
}

int venda_produto(Funcionarios *f, Produtos *p, Clientes *c) {
    
}