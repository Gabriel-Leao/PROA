Algoritmo "Ex0024"
// Disciplina  : [Linguagem e Lógica de Programação]
// Professor   : Obama
// Descrição   : Ler o salário do funcionário e calcular o salario final baseado numa comissão de 5% em vendas acima de 1500 e 3% em vendas abaixo
// Autor(a)    : Gabriel Leão
// Data atual  : 24/03/2022

Var
// Seção de Declarações das variáveis 
salario, comissao, salarioFinal, vendas: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Digite o salário: ")
leia(salario)
escreva("Digite o total de vendas: ")
leia(vendas)
se vendas > 1500 entao
   comissao <- 5
senao
   comissao <- 3
fimse
salarioFinal <- salario + (salario * comissao / 100)
escreval("O salário total é de R$", salarioFinal:2:2)

Fimalgoritmo
