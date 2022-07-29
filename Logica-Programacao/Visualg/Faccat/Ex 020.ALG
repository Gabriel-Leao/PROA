Algoritmo "ordem_crescente"
// Descrição   : coloca os números em ordem crescente
// Autor(a)    : Gabriel Leão
// Data atual  : 23/3/2022

Var
// Seção de Declarações das variáveis 
n1, n2: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite um número: ")
leia(n1)
escreva("Digite um número: ")
leia(n2)
se n1 < n2 entao
   escreval("A ordem crescente dos números é", n1, "", n2)
senao
   escreval("A ordem crescente dos números é", n2,",", n1)
fimse
Fimalgoritmo
