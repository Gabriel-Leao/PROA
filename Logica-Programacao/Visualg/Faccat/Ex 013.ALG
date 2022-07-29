Algoritmo "media ponderada"
// Descrição   : Ler três notas do aluno e retona a média ponderada
// Autor(a)    : Gabriel Leão
// Data atual  : 21/3/2022
Var
// Seção de Declarações das variáveis 
nota1, nota2, nota3, media: Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreva("Digite a 1° nota:")
leia(nota1)
Escreva("Digite a 2° nota:")
leia(nota2)
Escreva("Digite a 3° nota:")
leia(nota3)
media <- ((nota1*2) + (nota2*3) + (nota3*5)) / 10
escreval("A média ponderada do aluno é ", media)

Fimalgoritmo
