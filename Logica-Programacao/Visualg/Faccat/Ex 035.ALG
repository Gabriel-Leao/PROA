Algoritmo "Ex 035"

// Descri??o   : Gabriel Le?o da Silva
// Autor(a)    : Gabriel Le?o da SIlva
// Data atual  : 19/5/2022

Var

   // Se??o de Declara??es das vari?veis
   litros, preco, total: Real
   option: Caractere

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   Escreval("Digite o tipo de combustivo")
   Escreval("G = Gasolina")
   Escreval("A = ?lcool")
   Escreva("[G/A]: ")
   leia(option)
   escreva("Digite a quantidade de litros: ")
   leia(litros)
   se (option = "G") ou (option = "g") e (litros <= 20) entao
      preco <- 3.30 - 3.30 * 4 / 100
      total <- preco * litros
      escreval("O total a pagar ? de R$", total)
   senao
      se (option = "G") ou (option = "g") e (litros > 20) entao
         preco <- 3.30 - 3.30 * 6 / 100
         total <- preco * litros
         escreval("O total a pagar ? de R$", total)
      senao
         se (option = "A") ou (option = "a") e (litros > 20) entao
            preco <- 2.90 - 2.90 * 5 / 100
            total <- preco * litros
            escreval("O total a pagar ? de R$", total)
         senao
            se (option = "A") ou (option = "a") e (litros <= 20) entao
               preco <- 2.90 - 2.90 * 3 / 100
               total <- preco * litros
               escreval("O total a pagar ? de R$", total)
            senao
               escreval("Op??es invalidas")
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo