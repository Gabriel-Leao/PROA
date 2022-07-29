Algoritmo "eX 031"/

// Descrição   : Calcula se é possível forma um triângulo ou não
// Autor(a)    : Gabriel Leão
// Data atual  : 14/5/2022

Var
   // Seção de Declarações das variáveis
   A,B,C: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o comprimento do 1° lado do triângulo: ")
   leia(A)
   escreva("Digite o comprimento do 2° lado do triângulo: ")
   leia(B)
   escreva("Digite o comprimento do 3° lado do triângulo: ")
   leia(C)
   se (A = B) e (B = C) entao
      escreval("Com essas medidas o triângulo é equilátero")
   senao
      se (A = B) ou (A = C) ou (B = C) entao
         escreval("Com essas medidas o triângulo é isósceles")
      senao
         se (A + B < C) ou (A + C < B) ou (B + C < C) entao
            escreval("Com essas medidas é impossível formar um triângulo")
         senao
            escreval("Com essas medidas o triângulo é escaleno")
         fimse
      fimse
   fimse

Fimalgoritmo