Algoritmo "baskara"

Var

a  : real
b  : real
c  : real
x1 : real
x2 : real

delta : real

Inicio

escreva("Coeficiente a: ")
leia(a)
escreva("Coeficiente b: ")
leia(b)
escreva("Coeficiente c: ")
leia(c)

delta <- b^2 - 4 * a * c

se (delta > 0) entao
   x1 <- (- b + RaizQ(delta)) / (2 * a)
   x2 <- (- b - RaizQ(delta)) / (2 * a)
   escreval("X1 = ", x1:1:4)
   escreval("X2 = ", x2:1:4)
senao
   escreval("Esta equacao nao possui raizes reais")
fimse

Fimalgoritmo