Algoritmo "votar"
// Descrição   : Calcula a idade do usuário e diz se ele pode ou não voltar
// Autor(a)    : Gabriel Leão
// Data atual  : 23/3/2022

Var
// Seção de Declarações das variáveis 
ano, idade, nascimento: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Digite o ano atual: ")
leia(ano)
escreva("Digite o ano em que você nasceu: ")
leia(nascimento)
idade <- ano - nascimento
se idade >= 16 entao
   escreval("Você pode votar esse ano")
senao
   escreval("Você não pode votar esse ano")
fimse

Fimalgoritmo
