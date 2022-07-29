Algoritmo "Ex. 034"

// Descrição   : Teste de mesa
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 21/5/2022

Var
   // Seção de Declarações das variáveis
   x, y, z: Inteiro
   resposta: Caractere


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o valor de X: ")
   leia(x)
   escreva("Digite o valor de Y: ")
   leia(y)
   z <- (x * y) + 5
   se z <= 0 entao
      resposta <- "A"
   senao
      se z <= 100 entao
         resposta <- "B"
      senao
         resposta <- "C"
      fimse
   fimse
   escreva(z, resposta)

Fimalgoritmo