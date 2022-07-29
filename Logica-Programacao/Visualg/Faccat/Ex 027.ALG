Algoritmo "ex027"
// Descrição   : Lê um número e diz se ele é maior, menor ou igual a zero.
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 13/5/2022
Var
   // Seção de Declarações das variáveis
   numero: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite um número: ")
   leia(numero)
   se numero > 0 entao
      escreval("O número", numero, " é positivo.")
   senao
      se numero = 0 entao
         escreval("O número", numero, " é igaul a 0.")
      senao
         escreval("O número", numero, " é negativo.")
      fimse
   fimse
Fimalgoritmo