Algoritmo "ex 033"

// Descrição   : Lê dois valores e diz se o primeiro é maior, o segundo maior ou se os valores são iguias
// Autor(a)    : Gabriel Leão
// Data atual  : 14/5/2022

Var
   // Seção de Declarações das variáveis
   v1, v2: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o 1° número: ")
   leia(v1)
   escreva("Digite o 2° número: ")
   leia(v2)
   se v1 > v2 entao
      escreval("O primeiro é maior!")
   senao
      se v2 > v1 entao
         escreval("O segundo é maior!")
      senao
         escreval("Os números são iguais!")
      fimse
   fimse

Fimalgoritmo