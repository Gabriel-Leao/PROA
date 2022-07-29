Algoritmo "Ex 036"

// Descrição   : O progrma lê a idade de dois homens e duas mulheres. Calcula a soma da idade do homem mais velho e da mulher mais nova, e o produto das idades do homem mais novo com a mulher mais nova
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 19/5/2022

Var
   // Seção de Declarações das variáveis
   h1,h2,f1,f2,maiorH, maiorF, menorH, menorF: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite a idade do 1° homem: ")
   leia(h1)
   escreva("Digite a idade do 2° homem: ")
   leia(h2)
   escreva("Digite a idade da 1° mulher: ")
   leia(f1)
   escreva("Digite a idade do 2° mulher: ")
   leia(f2)
   se h1 >= h2 entao
      maiorH <- h1
      menorH <- h2
   senao
      maiorH <- h2
      menorH <- h1
   fimse
   se f1 >= f2 entao
      maiorF <- f1
      menorF <- f2
   senao
      maiorF <- f2
      menorF <- f1
   fimse
   Escreval("A soma das idades  do homem mais velho com a mulher mais nova é", maiorH + menorF)
   Escreval("O produto das idades da mulher mais velha com o homem mais novo é ", maiorF * menorH)

Fimalgoritmo