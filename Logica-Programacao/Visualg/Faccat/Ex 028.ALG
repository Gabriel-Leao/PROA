Algoritmo "ex 028"
// Descrição   : Lê três números e diz qual foi o maior digitado
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 13/5/2022
Var
   // Seção de Declarações das variáveis
   n1,n2,n3, maior: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o 1° número: ")
   leia(n1)
   escreva("Digite o 2° número: ")
   leia(n2)
   escreva("Digite o 3° número: ")
   leia(n3)
   se (n1 >= n2) e (n1 >= n3) entao
      maior <- n1
   senao
      se (n2 >= n1) e (n2 >= n3) entao
         maior <- n2
      senao
         maior <- n3
      fimse
   fimse
   escreval("O maior número digitado foi", maior)

Fimalgoritmo