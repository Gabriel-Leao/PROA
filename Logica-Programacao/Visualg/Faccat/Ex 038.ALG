Algoritmo "Ex 038"

// Descri??o   : L? o usu?rio e a senha e diz se os dados s?o v?lidos
// Autor(a)    : Gabriel Le?o da Silva
// Data atual  : 21/5/2022

Var
   // Se??o de Declara??es das vari?veis
   user, password: inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   Escreva("Digite o seu usu?rio: ")
   leia(user)
   Escreva("Digite a sua senha: ")
   leia(password)
   se user <> 1234 entao
      Escreval("Usu?rio Inv?lido!")
   senao
      se password <> 9999 entao
         Escreval("Senha incorreta!")
      senao
         Escreval("Acesso permitido")
      fimse
   fimse

Fimalgoritmo