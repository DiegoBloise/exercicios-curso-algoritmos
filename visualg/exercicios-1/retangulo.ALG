Algoritmo "Retangulo"

Var

baseRetangulo   : real
alturaRetangulo : real

area      : real
perimetro : real
diagonal  : real


Inicio

escreva("Base do retangulo: ")
leia(baseRetangulo)

escreva("Altura do retangulo: ")
leia(alturaRetangulo)

area <- baseRetangulo * alturaRetangulo
perimetro <- baseRetangulo * 2 + alturaRetangulo * 2
diagonal <- RaizQ(baseRetangulo^2 + alturaRetangulo^2)

escreval("AREA = ", area:1:4)
escreval("PERIMETRO = ", perimetro:1:4)
escreval("DIAGONAL = ", diagonal:1:4)

Fimalgoritmo