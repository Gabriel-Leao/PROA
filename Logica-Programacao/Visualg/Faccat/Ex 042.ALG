Algoritmo "Ex 042"

// Descri??o   : L? o c?digo do empregado, ano do seu nascimento, ano de ingresso na empresa e diz se requer aposentadoria ou n?o
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 21/5/2022

Var
   // Se??o de Declara??es das vari?veis
   codigoEmpregado, anoNascimento, anoIngresso, idade, tempoEmpresa: inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   Escreva("Digite o c?digo do empregado: ")
   leia(codigoEmpregado)
   Escreva("Digite o ano de nascimento: ")
   leia(anoNascimento)
   Escreva("Digite o ano de ingresso na empresa: ")
   leia(anoIngresso)
   idade <- 2022 - anoNascimento
   tempoEmpresa <- 2022 - anoIngresso
   Escreval("O funcion?rio de c?digo:", codigoEmpregado, ", tem", idade, " anos e est? a", tempoEmpresa, " anos na empresa.")
   se (idade >= 65) ou (tempoTrabalhado >= 30) entao
      Escreval("Requerer aposentadoria")
   senao
      se (idade >= 60) e (tempo trabalho >= 25) entao
         Escreval("Requerer aposentadoria")
      senao
         Escreval("N?o requerer")
      fimse
   fimse

Fimalgoritmo