Algoritmo "Ex 043"

// Descrição   : Teste de mesa (Triangulo equilatero)
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 21/5/2022

Var
   // Seção de Declarações das variáveis
   a, b, c: Real
   mens: Caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Informe o valor de A: ")
   leia(a)
   escreva("Informe o valor de B: ")
   leia(b)
   escreva("Informe o valor de C: ")
   leia(c)
   se (a < b + c) e (b < a + c) e (c < a + b) entao
      se (a = b) e (b = c) entao
         mens <- "Triângulo Equilátero"
      senao
         se (a = b) ou (b = c) ou (a = c)entao
            mens <- "Triângulo Isósceles"
         senao
            mens <- "Triângulo Escaleno"
         fimse
      fimse
   senao
      mens <- "Não forma um triângulo"
   fimse
   escreva(mens)

Fimalgoritmo