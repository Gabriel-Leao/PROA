Algoritmo "ex 033"

// Descri??o   : L? dois valores e diz se o primeiro ? maior, o segundo maior ou se os valores s?o iguias
// Autor(a)    : Gabriel Le?o
// Data atual  : 14/5/2022

Var
   // Se??o de Declara??es das vari?veis
   v1, v2: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite o 1? n?mero: ")
   leia(v1)
   escreva("Digite o 2? n?mero: ")
   leia(v2)
   se v1 > v2 entao
      escreval("O primeiro ? maior!")
   senao
      se v2 > v1 entao
         escreval("O segundo ? maior!")
      senao
         escreval("Os n?meros s?o iguais!")
      fimse
   fimse

Fimalgoritmo