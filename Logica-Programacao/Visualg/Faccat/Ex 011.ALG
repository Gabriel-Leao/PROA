Algoritmo "Revendedora de carros"
// Descrição   : Calcula o salário final de um vendedor
// Autor(a)    : Gabriel Leão
// Data atual  : 21/3/2022

Var
// Seção de Declarações das variáveis 
salario, totVendas, comissao, bonus, salarioFinal: Real
carrosVendidos: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Quantos carros foram vendidos?")
leia(carrosVendidos)
escreva("Valor total das vendas: R$")
leia(totVendas)
Escreva("Digite o seu salário: R$")
leia(salario)
escreva("Digite o valor de comissão: R$")
leia(comissao)
bonus <- 5 * totVendas / 100
salarioFinal <- salario + bonus + (comissao * carrosVendidos)
escreval("O salário final do vendedor é R$", salarioFinal:2:2)

Fimalgoritmo
