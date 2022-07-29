Algoritmo "Ex 042"

// Descrição   : Lê o código do empregado, ano do seu nascimento, ano de ingresso na empresa e diz se requer aposentadoria ou não
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 21/5/2022

Var
   // Seção de Declarações das variáveis
   codigoEmpregado, anoNascimento, anoIngresso, idade, tempoEmpresa: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreva("Digite o código do empregado: ")
   leia(codigoEmpregado)
   Escreva("Digite o ano de nascimento: ")
   leia(anoNascimento)
   Escreva("Digite o ano de ingresso na empresa: ")
   leia(anoIngresso)
   idade <- 2022 - anoNascimento
   tempoEmpresa <- 2022 - anoIngresso
   Escreval("O funcionário de código:", codigoEmpregado, ", tem", idade, " anos e está a", tempoEmpresa, " anos na empresa.")
   se (idade >= 65) ou (tempoTrabalhado >= 30) entao
      Escreval("Requerer aposentadoria")
   senao
      se (idade >= 60) e (tempo trabalho >= 25) entao
         Escreval("Requerer aposentadoria")
      senao
         Escreval("Não requerer")
      fimse
   fimse

Fimalgoritmo