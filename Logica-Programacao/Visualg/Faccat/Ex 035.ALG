Algoritmo "Ex 035"

// Descrição   : Gabriel Leão da Silva
// Autor(a)    : Gabriel Leão da SIlva
// Data atual  : 19/5/2022

Var

   // Seção de Declarações das variáveis
   litros, preco, total: Real
   option: Caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval("Digite o tipo de combustivo")
   Escreval("G = Gasolina")
   Escreval("A = Álcool")
   Escreva("[G/A]: ")
   leia(option)
   escreva("Digite a quantidade de litros: ")
   leia(litros)
   se (option = "G") ou (option = "g") e (litros <= 20) entao
      preco <- 3.30 - 3.30 * 4 / 100
      total <- preco * litros
      escreval("O total a pagar é de R$", total)
   senao
      se (option = "G") ou (option = "g") e (litros > 20) entao
         preco <- 3.30 - 3.30 * 6 / 100
         total <- preco * litros
         escreval("O total a pagar é de R$", total)
      senao
         se (option = "A") ou (option = "a") e (litros > 20) entao
            preco <- 2.90 - 2.90 * 5 / 100
            total <- preco * litros
            escreval("O total a pagar é de R$", total)
         senao
            se (option = "A") ou (option = "a") e (litros <= 20) entao
               preco <- 2.90 - 2.90 * 3 / 100
               total <- preco * litros
               escreval("O total a pagar é de R$", total)
            senao
               escreval("Opçôes invalidas")
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo