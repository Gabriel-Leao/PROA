Algoritmo "macas"
// Descrição   : Um programa que calcula o preço da maçã
// Autor(a)    : Gabriel Leão
// Data atual  : 23/3/2022

Var
// Seção de Declarações das variáveis 
quantidade: inteiro
preco, unidade: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Quantas maçãs você quer levar? ")
leia(quantidade)
se quantidade >= 12 entao
   unidade <- 1.00
senao
   unidade <- 1.30
Fimse
preco <- quantidade * unidade
Escreval("O valor final é de R$", preco:2:2)

Fimalgoritmo
