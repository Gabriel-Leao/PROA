Algoritmo "ex 030"
// Descri??o   : L? tr?s n?meros e os coloca em ordem crescente
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 13/5/2022
Var
   // Se??o de Declara??es das vari?veis
   n1,n2,n3: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite o 1? n?mero: ")
   leia(n1)
   escreva("Digite o 2? n?mero: ")
   leia(n2)
   escreva("Digite o 3? n?mero: ")
   leia(n3)
   se (n1 >= n2) e (n2 >= n3) entao
      escreval("Os n?meros do menor para o maior: ", n1, n2, n3)
   senao
      se (n2 >= n1) e (n1 >= n3) entao
         escreval("Os n?meros do menor para o maior: ", n2, n1, n3)
      senao
         se (n3 >= n1) e (n1 >= n2) entao
            escreval("Os n?meros do menor para o maior: ", n3, n1, n2)
         senao
            se (n2 >= n3) e (n3 >= n1) entao
               escreval("Os n?meros do menor para o maior: ", n2, n3, n1)
            senao
               se (n3 >= n2) e (n2 >= n1) entao
                  escreval("Os n?meros do menor para o maior: ", n3, n2, n1)
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo