Algoritmo "Ex 041"

// Descri??o   : L? 3 notas obtidas por um aluno e a media dos exerc?cios, depois calcula a m?dia de aproveitamento.
// Autor(a)    : Gabriel Le?o da SIlva
// Data atual  : 21/5/2022

Var
   // Se??o de Declara??es das vari?veis
   nota1,nota2,nota3, mediaExercicios, aproveitamento: Real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   Escreva("Digite a 1? nota: ")
   leia(nota1)
   Escreva("Digite a 2? nota: ")
   leia(nota2)
   Escreva("Digite a 3? nota: ")
   leia(nota3)
   Escreva("Digite a m?dia  dos exerc?cios: ")
   leia(mediaExercicios)
   aproveitamento <- (((nota1 + nota2) * 2)  + nota3 * 3 + mediaExercicios) / 7
   se aproveitamento > 9.0 entao
      Escreval("Conceito do aluno: A")
   senao
      se (aproveitamento >= 7.5) e (aproveitamento < 9.0) entao
         Escreval("Conceito do aluno: B")
      senao
         se (aproveitamento >= 6.0) e (aproveitamento < 7.5) entao
            Escreval("Conceito do aluno: C")
         senao
            Escreval("Conceito do aluno: D")
         fimse
      fimse
   fimse

Fimalgoritmo