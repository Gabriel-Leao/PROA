Algoritmo "ex027"
// Descri??o   : L? um n?mero e diz se ele ? maior, menor ou igual a zero.
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 13/5/2022
Var
   // Se??o de Declara??es das vari?veis
   numero: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite um n?mero: ")
   leia(numero)
   se numero > 0 entao
      escreval("O n?mero", numero, " ? positivo.")
   senao
      se numero = 0 entao
         escreval("O n?mero", numero, " ? igaul a 0.")
      senao
         escreval("O n?mero", numero, " ? negativo.")
      fimse
   fimse
Fimalgoritmo