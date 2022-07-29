Algoritmo "Ex 037"

// Descrição   : Lê quantos quilos de maçã e de morango o usuário vai levar e diz o total da compra
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 21/5/2022

Var
   // Seção de Declarações das variáveis
   qtyMorango, qtyMaca: inteiro
   pMaca, pmorango, totMorangos, totMacas, total: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreva("Digite quantos quilos de Morangos comprados: ")
   leia(qtyMorango)
   Escreva("Digite quantos quilos de Maçãs compradas: ")
   leia(qtyMaca)
   se qtyMorango > 5 entao
      pMorango <- 2.20
   senao
      pMorango <- 2.50
   fimse
   se qtyMaca > 5 entao
      pMaca <- 1.50
   senao
      pMaca <- 1.80
   fimse
   totMorangos <- pMorango * qtyMorango
   totMacas <- pMaca * qtyMaca
   total <- totMacas + totMorangos
   se (qtyMaca + qtyMorango > 8) ou (total > 25.00) entao
      total <- total - total * 10 / 100
   fimse
   escreva("O total a pagar é R$", total)

Fimalgoritmo