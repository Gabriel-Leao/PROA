Algoritmo "ex 028"
// Descri??o   : L? tr?s n?meros e diz qual foi o maior digitado
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 13/5/2022
Var
   // Se??o de Declara??es das vari?veis
   n1,n2,n3, maior: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite o 1? n?mero: ")
   leia(n1)
   escreva("Digite o 2? n?mero: ")
   leia(n2)
   escreva("Digite o 3? n?mero: ")
   leia(n3)
   se (n1 >= n2) e (n1 >= n3) entao
      maior <- n1
   senao
      se (n2 >= n1) e (n2 >= n3) entao
         maior <- n2
      senao
         maior <- n3
      fimse
   fimse
   escreval("O maior n?mero digitado foi", maior)

Fimalgoritmo