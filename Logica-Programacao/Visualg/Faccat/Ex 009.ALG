Algoritmo "salário"
// Descrição   : Calcula um reajuste salarial com 10% de aumento
// Autor(a)    : Gabriel Leão
// Data atual  : 21/3/2022

Var
// Seção de Declarações das variáveis 
salario, novoSalario, reajuste, porcentagemAumento: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o seu salário atual: R$")
leia(salario)
escreva("Porcentagem de aumento: ")
leia(porcentagemAumento)
escreval("Quem recebia R$", salario:2:2)
reajuste <- porcentagemAumento * salario / 100
novoSalario <- salario + reajuste
escreval("Com o reajuste de", porcentagemAumento, "% vai recerber R$", novoSalario:2:2)

Fimalgoritmo
