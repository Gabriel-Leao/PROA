Algoritmo "Ex 038"

// Descrição   : Lê o usuário e a senha e diz se os dados são válidos
// Autor(a)    : Gabriel Leão da Silva
// Data atual  : 21/5/2022

Var
   // Seção de Declarações das variáveis
   user, password: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreva("Digite o seu usuário: ")
   leia(user)
   Escreva("Digite a sua senha: ")
   leia(password)
   se user <> 1234 entao
      Escreval("Usuário Inválido!")
   senao
      se password <> 9999 entao
         Escreval("Senha incorreta!")
      senao
         Escreval("Acesso permitido")
      fimse
   fimse

Fimalgoritmo