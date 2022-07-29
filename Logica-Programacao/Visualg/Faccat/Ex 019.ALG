Algoritmo "Maior_menor"
// Descrição   : Ler dois números e diz qual foi o maior valor digitado
// Autor(a)    : Gabriel Leão
// Data atual  : 23/3/2022

Var
// Seção de Declarações das variáveis 
valor1, valor2: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Digite um número: ")
leia(valor1)
Escreva("Digite um número: ")
leia(valor2)
escreval("Os números digitados foram", valor1, " e", valor2)
se valor1 = valor2 entao
   escreval("Os números são iguais")
senao
   se valor1 > valor2 entao
      escreval("O número ",valor1," é o maior")
   senao
      escreval("O número ",valor2," é o maior")
   fimse
fimse

Fimalgoritmo
