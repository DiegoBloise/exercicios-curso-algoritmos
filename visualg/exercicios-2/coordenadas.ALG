Algoritmo "coordenadas"

Var

x, y : real
msg : caractere

Inicio

escreva("Valor de X: ")
leia(x)
escreva("Valor de Y: ")
leia(y)

se x > 0 entao
  se y < 0 entao
    msg <- "Q4"
  senao
    msg <- "Q1"
  fimse
fimse

se x < 0 entao
  se y > 0 entao
    msg <- "Q2"
  senao
    msg <- "Q3"
  fimse
fimse

se x = 0 entao
  msg <- "Eixo Y"
fimse

se y = 0 entao
  msg <- "Eixo X"
fimse

se (x = 0) e (y = 0) entao
  msg <- "Origem"
fimse

escreval(msg)

Fimalgoritmo