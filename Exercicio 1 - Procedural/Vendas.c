#include <Funcionarios.h>
#include <Produtos.h>
#include <Clientes.h>
#include <String.h>
#include <Vendas.h>

typedef struct Vendas vendas
{
    int codigo_produto;
    char funcionario[100];
    char produto[100];
    char cliente[100];
    float preco;
};

Vendas *cadastrar_venda(Funcionarios *f, Produtos *p, Clientes *c)
{

    Vendas *v;

    v = (Vendas *) malloc(1 * sizeof(Vendas));

    if (v != NULL)
    {
        v->codigo_produto = p->codigo;
        strcpy(v->funcionario, f->nome);
        strcpy(v->produto, p->nome);
        strcpy(v->cliente, c->nome);
        v->preco = p->preco;
    }

    return v;
}