Algoritmo "eleitores"
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Gabriel Leão
// Data atual  : 17/3/2022

Var
// Seção de Declarações das variáveis
totalEleitores, brancos, nulos, validos:inteiro
PBrancos, PNulos, PValidos: Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc
Escreva("Total de eleitores: ")
leia(totalEleitores)
Escreva("Votos brancos: ")
leia(brancos)
PBrancos <- brancos * 100 / totalEleitores
escreva("Votos nulos: ")
leia(nulos)
PNulos <- nulos * 100 / totalEleitores
validos <- totalEleitores - (brancos + nulos)
PValidos <- validos * 100 / totalEleitores
Escreval("O total de eleitores foi", totalEleitores)
Escreval("O total de votos brancos foi", brancos, ", que é", PBrancos, "% do total")
Escreval("O total de votos nulos foi", nulos, ", que é", PNulos, "% do total")
Escreval("O total de votos válidos foi", validos, ", que é", PValidos, "% do total")

Fimalgoritmo
