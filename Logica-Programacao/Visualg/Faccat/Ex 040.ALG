Algoritmo "Ex 040"

// Descrição   : Lê o nome, quantidade, preço do produto w calcula o total a pagar
// Autor(a)    : Gabriel Leão da SIlva
// Data atual  : 21/5/2022

Var
   // Seção de Declarações das variáveis
   nome: caractere
   qty: Inteiro
   preco, total, desconto: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreva("Digite o nome do produto: ")
   leia(nome)
   Escreva("Digite a quantidade adquirida: ")
   leia(qty)
   Escreva("Digite o preço do produto R$: ")
   leia(preco)
   total <- preco * qty
   se qty <= 5 entao
      desconto <- total * 2 / 100
   senao
      se (qty > 5) e (qty <= 10) entao
         desconto <- total * 3 / 100
      senao
         desconto <- total * 5 / 100
      fimse
   fimse
   total <- total - desconto
   Escreval("O total a ser pago pelo produto ", nome, " é R$", total)

Fimalgoritmo