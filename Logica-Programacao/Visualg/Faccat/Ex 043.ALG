Algoritmo "Ex 043"

// Descri??o   : Teste de mesa (Triangulo equilatero)
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 21/5/2022

Var
   // Se??o de Declara??es das vari?veis
   a, b, c: Real
   mens: Caractere

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Informe o valor de A: ")
   leia(a)
   escreva("Informe o valor de B: ")
   leia(b)
   escreva("Informe o valor de C: ")
   leia(c)
   se (a < b + c) e (b < a + c) e (c < a + b) entao
      se (a = b) e (b = c) entao
         mens <- "Tri?ngulo Equil?tero"
      senao
         se (a = b) ou (b = c) ou (a = c)entao
            mens <- "Tri?ngulo Is?sceles"
         senao
            mens <- "Tri?ngulo Escaleno"
         fimse
      fimse
   senao
      mens <- "N?o forma um tri?ngulo"
   fimse
   escreva(mens)

Fimalgoritmo