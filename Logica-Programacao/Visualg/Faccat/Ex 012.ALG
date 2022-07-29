Algoritmo "Conversor de temperatura"
// Descrição   : Um programa que converte a temperatura fahrenheit em celsius
// Autor(a)    : Gabriel Leão
// Data atual  : 21/3/2022

Var
// Seção de Declarações das variáveis 
f: inteiro
c: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Digite a temperatura em F°")
leia(f)
c <- (f - 32) / 1.8
Escreval("A temperatura F°", f, "convertida para celsius é C°", c:2)

Fimalgoritmo
