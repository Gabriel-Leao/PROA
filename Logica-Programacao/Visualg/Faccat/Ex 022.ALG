Algoritmo "ex022"
// Descri??o   : Calcula o sal?rio final com um aumento de 50% caso o funcion?rio tenha feito hora extra
// Autor(a)    : Gabriel Le�o da Silva
// Data atual  : 12/5/2022
Var
   // Se??o de Declara??es das vari?veis
   horas, salarioHora, salarioFinal: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite as horas trabalhadas no m?s: ")
   leia(horas)
   escreva("Digite o sal?rio por hora R$")
   leia(salarioHora)
   se horas >= 160 entao
      salarioFinal <- horas * (salarioHora + salarioHora*50/100)
   senao entao
      salarioFinal <- horas * salarioHora
   fimse
   escreva("O Sal?rio final ? de R$",salarioFinal)

Fimalgoritmo