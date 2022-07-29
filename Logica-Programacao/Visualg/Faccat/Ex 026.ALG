Algoritmo "ex026"
// Descrição   : O programa para calcular a quantidade média de um produto em estoque e diz se é preciso comprar mais produtos ou não
// Autor(a)    : Gabriel Leão da SIlva
// Data atual  : 13/5/2022
Var
   // Seção de Declarações das variáveis
   qtyAtual, qtyMax, qtyMin: inteiro
   qtyMedia: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Quantidade atual do produto: ")
   leia(qtyAtual)
   escreva("Quantidade máxima do produto: ")
   leia(qtyMax)
   escreva("Quantidade minima do produto: ")
   leia(qtyMin)
   qtyMedia <- (qtyMax + qtyMin) / 2
   se qtyAtual >= qtyMedia entao
      escreval("Não é necessário a compra de mais produtos.")
   senao
      escreval("É necessário a compra de mais", qtyMedia - qtyAtual, " produtos.")
   fimse

Fimalgoritmo