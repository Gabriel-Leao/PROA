Algoritmo "bhaskara"
// Disciplina  : [Linguagem e L?gica de Programa??o]
// Professor   : Obama
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Gabriel Le?o
// Data atual  : 29/03/2022

Var
   // Se??o de Declara??es das vari?veis
   a, b, c: inteiro
   delta, x, x1: real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   Escreva("Digite o valor de A: ")
   Leia(a)
   Escreva("Digite o valor de B: ")
   Leia(b)
   Escreva("Digite o valor de C: ")
   Leia(c)
   Escreval("==========================")
   se (a > 0) e (b > 0) e (c > 0) entao
      delta <- b^2 - 4 * a * c
      Escreval("O delta ?", delta)
      se delta = 0 entao
         x <- (-b  + raizq(delta)) / (2 * a)
         Escreval("O valode de X' ?", x)
      senao
         se delta < 0 entao
            Escreval("N?o existem ra?zes reais ")
         senao
            x <- (-b  + raizq(delta)) / (2 * a)
            x1 <- (-b - raizq(delta)) / (2 * a)
            Escreval("O valode de X' ?", x)
            Escreval("O valode de X'' ?", x1)
         fimse
      fimse
   senao
      Escreval("N?o ? poss?vel calcular o delta")
   fimse

Fimalgoritmo