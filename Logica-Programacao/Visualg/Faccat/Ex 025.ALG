Algoritmo "ex025"
// Descri??o   : O programa ler o n?mero da conta, saldo, d?bito e cr?dito e diz se o saldo ? positivo ou n?o.
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 13/5/2022
Var
   // Se??o de Declara??es das vari?veis
   conta: Inteiro
   saldo, debito, credito, gastos, saldoAtual: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva("Digite o n?mero da conta: ")
   leia(conta)
   escreva("Digite o saldo da conta: ")
   leia(saldo)
   escreva("Digite o valor da fatura de cr?dito: R$")
   leia(credito)
   escreva("Digite o valor a ser debitado: R$")
   leia(debito)
   gastos <- debito + credito
   saldoAtual <- saldo - gastos
   se saldoAtual >= 0 entao
      escreval("O saldo ? positivo")
   senao
      escreval("O saldo ? negativo")
   fimse

Fimalgoritmo