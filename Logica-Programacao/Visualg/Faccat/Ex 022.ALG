Algoritmo "ex022"
// Descrição   : Calcula o salário final com um aumento de 50% caso o funcionário tenha feito hora extra
// Autor(a)    : Gabriel Leï¿½o da Silva
// Data atual  : 12/5/2022
Var
   // Seção de Declarações das variáveis
   horas, salarioHora, salarioFinal: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite as horas trabalhadas no mês: ")
   leia(horas)
   escreva("Digite o salário por hora R$")
   leia(salarioHora)
   se horas >= 160 entao
      salarioFinal <- horas * (salarioHora + salarioHora*50/100)
   senao entao
      salarioFinal <- horas * salarioHora
   fimse
   escreva("O Salário final é de R$",salarioFinal)

Fimalgoritmo