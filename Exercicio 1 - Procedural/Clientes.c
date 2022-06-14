#include <Clientes.h>
#include <String.h>

typedef struct Clientes clientes
{
    int cpf;
    char nome[100];
    char data_nasc[15];
    int cep;
};

Clientes *cadastrar_cliente(int cpf, char n[100], char data[100], int cep)
{
    Clientes *c;
    c = (Clientes *) malloc(1 * sizeof(Clientes));

    if (c != NULL)
    {
        c->cpf = c;
        strcpy(c->nome, n);
        strcpy(c->data_nasc, data);
        c->cep = cep;
    }

    return c;
}