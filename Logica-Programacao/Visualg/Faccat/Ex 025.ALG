Algoritmo "ex025"
// Descrição   : O programa ler o número da conta, saldo, débito e crédito e diz se o saldo é positivo ou não.
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 13/5/2022
Var
   // Seção de Declarações das variáveis
   conta: Inteiro
   saldo, debito, credito, gastos, saldoAtual: Real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Digite o número da conta: ")
   leia(conta)
   escreva("Digite o saldo da conta: ")
   leia(saldo)
   escreva("Digite o valor da fatura de crédito: R$")
   leia(credito)
   escreva("Digite o valor a ser debitado: R$")
   leia(debito)
   gastos <- debito + credito
   saldoAtual <- saldo - gastos
   se saldoAtual >= 0 entao
      escreval("O saldo é positivo")
   senao
      escreval("O saldo é negativo")
   fimse

Fimalgoritmo