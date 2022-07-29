Algoritmo "aprovado_reprovado"
// Descrição   : Calcula a media do aluno e diz se ele foi aprovado ou reprovado
// Autor(a)    : Gabriel Leão
// Data atual  : 23/3/2022

Var
// Seção de Declarações das variáveis 
media, nota1, nota2: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite a 1° nota do aluno: ")
leia(nota1)
escreva("Digite a 2° nota do aluno: ")
leia(nota2)
media <- (nota1 + nota2) / 2
escreval("A média do aluno foi ", media:2:1)
se media >= 6 entao
   escreval("Aprovado!")
senao
   escreval("REPROVADO!")
fimse

Fimalgoritmo
