Algoritmo "ex026"
// Descri??o   : O programa para calcular a quantidade m?dia de um produto em estoque e diz se ? preciso comprar mais produtos ou n?o
// Autor(a)    : Gabriel Le?o da SIlva
// Data atual  : 13/5/2022
Var
   // Se??o de Declara??es das vari?veis
   qtyAtual, qtyMax, qtyMin: inteiro
   qtyMedia: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Quantidade atual do produto: ")
   leia(qtyAtual)
   escreva("Quantidade m?xima do produto: ")
   leia(qtyMax)
   escreva("Quantidade minima do produto: ")
   leia(qtyMin)
   qtyMedia <- (qtyMax + qtyMin) / 2
   se qtyAtual >= qtyMedia entao
      escreval("N?o ? necess?rio a compra de mais produtos.")
   senao
      escreval("? necess?rio a compra de mais", qtyMedia - qtyAtual, " produtos.")
   fimse

Fimalgoritmo