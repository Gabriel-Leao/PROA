Algoritmo "idade"
// Descrição   : Idade em dias, considetando o mês com 30 dias e o ano com 365
// Autor(a)    : Gabriel Leão
// Data atual  : 17/3/2022

Var
// Seção de Declarações das variáveis 
anos,meses,dias,anosEmDias,mesesEmDias,idadeEmDias: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Digite quantos anos você tem: ")
leia(anos)
anosEmDias <- anos * 365
Escreva("Digite quantos meses: ")
leia(meses)
mesesEmDias <- meses * 30
Escreva("Digite quantos dias: ")
leia(dias)
idadeEmDias <- anosEmDias + mesesEmDias + dias
Escreva("A sua idade em dias é", idadeEmDias)
//Eu tenho 18 anos 7 meses e 22 dias no dia que esse programa foifeito

Fimalgoritmo
