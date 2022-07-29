Algoritmo "Peso_ideal"
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel Leão
// Data atual  : 23/3/2022
Var
// Seção de Declarações das variáveis 
nome, sexo: CARACTERE
altura, pesoIdeal: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o seu nome: ")
leia(nome)
escreva("Digtite a sua altura em M²: ")
leia(altura)
escreva("Digite o seu sexo [F/M]: ")
leia(sexo)
se sexo = "M" entao
   pesoIdeal <- (72.7 * altura) - 58
senao
   pesoIdeal <- (62.1 * altura) - 44.7
fimse
escreval("O peso idealde ", nome, " é:", pesoIdeal:2:1)

Fimalgoritmo
