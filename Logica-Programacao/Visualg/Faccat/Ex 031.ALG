Algoritmo "eX 031"/

// Descri??o   : Calcula se ? poss?vel forma um tri?ngulo ou n?o
// Autor(a)    : Gabriel Le?o
// Data atual  : 14/5/2022

Var
   // Se??o de Declara??es das vari?veis
   A,B,C: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite o comprimento do 1? lado do tri?ngulo: ")
   leia(A)
   escreva("Digite o comprimento do 2? lado do tri?ngulo: ")
   leia(B)
   escreva("Digite o comprimento do 3? lado do tri?ngulo: ")
   leia(C)
   se (A = B) e (B = C) entao
      escreval("Com essas medidas o tri?ngulo ? equil?tero")
   senao
      se (A = B) ou (A = C) ou (B = C) entao
         escreval("Com essas medidas o tri?ngulo ? is?sceles")
      senao
         se (A + B < C) ou (A + C < B) ou (B + C < C) entao
            escreval("Com essas medidas ? imposs?vel formar um tri?ngulo")
         senao
            escreval("Com essas medidas o tri?ngulo ? escaleno")
         fimse
      fimse
   fimse

Fimalgoritmo