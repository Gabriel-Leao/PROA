Algoritmo "ex 030"
// Descrição   : Lê três números e os coloca em ordem crescente
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 13/5/2022
Var
   // Seção de Declarações das variáveis
   n1,n2,n3: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o 1° número: ")
   leia(n1)
   escreva("Digite o 2° número: ")
   leia(n2)
   escreva("Digite o 3° número: ")
   leia(n3)
   se (n1 >= n2) e (n2 >= n3) entao
      escreval("Os números do menor para o maior: ", n1, n2, n3)
   senao
      se (n2 >= n1) e (n1 >= n3) entao
         escreval("Os números do menor para o maior: ", n2, n1, n3)
      senao
         se (n3 >= n1) e (n1 >= n2) entao
            escreval("Os números do menor para o maior: ", n3, n1, n2)
         senao
            se (n2 >= n3) e (n3 >= n1) entao
               escreval("Os números do menor para o maior: ", n2, n3, n1)
            senao
               se (n3 >= n2) e (n2 >= n1) entao
                  escreval("Os números do menor para o maior: ", n3, n2, n1)
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo