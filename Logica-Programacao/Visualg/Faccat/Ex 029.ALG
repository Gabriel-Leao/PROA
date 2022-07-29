Algoritmo "ex 029"
// Descrição   : Lê três números e soma os dois maiores
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 13/5/2022
Var
   // Seção de Declarações das variáveis
   n1,n2,n3,soma: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o 1° número: ")
   leia(n1)
   escreva("Digite o 2° número: ")
   leia(n2)
   escreva("Digite o 3° número: ")
   leia(n3)
   se (n1 >= n2) e (n2 >= n3) entao
      soma <- n1 + n2
   senao
      se (n1 >= n3) e (n3 >= n2) ou (n3 >= n1) e (n1 >= n2)entao
         soma <- n1 + n3
      senao
         se (n2 >= n1) e (n1 >= n3) entao
            soma <- n2 + n1
         senao
            soma <- n2 + n3
         fimse
      fimse
   fimse
   escreval("A soma dos dois maiores números é", soma)

Fimalgoritmo