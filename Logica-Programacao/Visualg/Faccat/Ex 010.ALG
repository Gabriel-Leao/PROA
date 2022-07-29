Algoritmo "Custo carro"
// Descrição   : Calcula o custo final de um carro baeado que 45% são de impostos e 28% do distribuidor
// Autor(a)    : Gabriel Leão
// Data atual  : 21/3/2022

Var
// Seção de Declarações das variáveis 
 fabrica, impostos, distribuidor, total: Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o preço de fábrica: R$")
leia(fabrica)
impostos <- 45 * fabrica / 100
distribuidor <- 28 * fabrica / 100
total <- fabrica + impostos + distribuidor)
Escreval("O custo final é de R$", total:2:2)

Fimalgoritmo
