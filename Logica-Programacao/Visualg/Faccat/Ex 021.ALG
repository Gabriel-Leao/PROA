Algoritmo "ex021"
// Descri??o   : Mostra quantas horas durou uma partida de xadrez
// Autor(a)    : Gabriel Le?o
// Data atual  : 25/3/2022

Var
   // Se??o de Declara??es das vari?veis
   horarioInicial, horarioFinal,total: inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite o hor?rio inicial da partida: ")
   leia(horarioInicial)
   escreva("Digite o hor?rio final da partida: ")
   leia(horarioFinal)
   total <- horarioFinal - horarioInicial
   se total < 0 entao
      total <- total + 24
   fimse
   escreval("A partida de xadrez durou", total, " horas")

Fimalgoritmo