Algoritmo "glicose"

Var

glicose : real
classificacao : caractere

Inicio

escreva("Digite a medida da glicose: ")
leia(glicose)

classificacao <- "normal"

se (glicose > 100) e (glicose <= 140) entao
   classificacao <- "elevado"
fimse

se glicose > 140 entao
   classificacao <- "diabetes"
fimse

escreval("Classificacao: ", classificacao)

Fimalgoritmo