Algoritmo "Ex. 034"

// Descri??o   : Teste de mesa
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 21/5/2022

Var
   // Se??o de Declara??es das vari?veis
   x, y, z: Inteiro
   resposta: Caractere


Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
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