Algoritmo "ex021"
// Descrição   : Mostra quantas horas durou uma partida de xadrez
// Autor(a)    : Gabriel Leão
// Data atual  : 25/3/2022

Var
   // Seção de Declarações das variáveis
   horarioInicial, horarioFinal,total: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o horário inicial da partida: ")
   leia(horarioInicial)
   escreva("Digite o horário final da partida: ")
   leia(horarioFinal)
   total <- horarioFinal - horarioInicial
   se total < 0 entao
      total <- total + 24
   fimse
   escreval("A partida de xadrez durou", total, " horas")

Fimalgoritmo