Algoritmo "dardo"

Var

d1, d2, d3, maior : real

Inicio

escreval("Digite as tres distancias:")
leia(d1)
leia(d2)
leia(d3)

maior <- d3

se (d1 > d2) e (d1 > d3) entao
   maior <- d1
fimse

se (d2 > d1) e (d2 > d3) entao
   maior <- d2
fimse

escreval("MAIOR DISTANCIA = ", maior)

Fimalgoritmo