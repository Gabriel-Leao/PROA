Algoritmo "ex 032"
// Descri??o   : L? os nomes dos times e diz se algum ganhou ou se houve um empate
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 14/5/2022

Var
   // Se??o de Declara??es das vari?veis
   time1, time2: caractere
   golsTime1, golsTime2:Inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite o nome do 1? time: ")
   leia(time1)
   escreva("Digite quantos gols esse time fez: ")
   leia(golsTime1)
   escreva("Digite o nome do 2? time: ")
   leia(time2)
   escreva("Digite quantos gols esse time fez: ")
   leia(golsTime2)
   se golsTime1 > golsTime2 entao
      escreval("O ", time1, " ganhou o jogo por",golsTime1, " x", golsTime2)
   senao
      se golsTime2 > golsTime1 entao
         escreval("O ", time2, " ganhou o jogo por",golsTime2, " x", golsTime1)
      senao
         escreval("Os dois times empataram por um placar de")
         escreval(time1,golsTime1, " x ",golsTime2, " ",time2)
      fimse
   fimse

Fimalgoritmo