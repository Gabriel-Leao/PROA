Algoritmo "bhaskara"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : Obama
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel Leão
// Data atual  : 29/03/2022

Var
   // Seção de Declarações das variáveis
   a, b, c: inteiro
   delta, x, x1: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreva("Digite o valor de A: ")
   Leia(a)
   Escreva("Digite o valor de B: ")
   Leia(b)
   Escreva("Digite o valor de C: ")
   Leia(c)
   Escreval("==========================")
   se (a > 0) e (b > 0) e (c > 0) entao
      delta <- b^2 - 4 * a * c
      Escreval("O delta é", delta)
      se delta = 0 entao
         x <- (-b  + raizq(delta)) / (2 * a)
         Escreval("O valode de X' é", x)
      senao
         se delta < 0 entao
            Escreval("Não existem raízes reais ")
         senao
            x <- (-b  + raizq(delta)) / (2 * a)
            x1 <- (-b - raizq(delta)) / (2 * a)
            Escreval("O valode de X' é", x)
            Escreval("O valode de X'' é", x1)
         fimse
      fimse
   senao
      Escreval("Não é possível calcular o delta")
   fimse

Fimalgoritmo