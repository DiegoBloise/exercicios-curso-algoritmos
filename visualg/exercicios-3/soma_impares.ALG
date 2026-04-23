Algoritmo "soma_impares"

Var

x, y, i, step, soma : inteiro

Inicio

escreval("Digite dois numeros:")
leia(x)
leia(y)

se x < y entao
  step <- 1
senao
  step <- -1
fimse

soma <- 0
para i de x ate y passo step faca
  se (i % 2 <> 0) e (i <> x) e (i <> y) entao
    soma <- soma + i
  fimse
fimpara

escreval("SOMA DOS IMPARES: ", soma)

Fimalgoritmo