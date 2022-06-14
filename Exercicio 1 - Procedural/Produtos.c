#include <Produtos.h>
#include <String.h>

typedef struct Produtos produtos
{
    int codigo;
    char nome[100];
    char fabricante[100];
    float preco;
};

Produtos *cadastrar_produto(int c, char n[100], char f[100], float preco)
{

    Produtos *p;

    p = (Produtos *) malloc(1 * sizeof(Produtos));

    if (p != NULL)
    {
        p->codigo = c;
        strcpy(p->nome, n);
        strcpy(p->fabricante, f);
        p->preco = preco;
    }

    return p;
}