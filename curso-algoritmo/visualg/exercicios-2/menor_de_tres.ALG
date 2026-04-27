Algoritmo "menor_de_tres"

Var

num1, num2, num3, menor : inteiro

Inicio

escreva("Primeiro valor: ")
leia(num1)
escreva("Segundo valor: ")
leia(num2)
escreva("Terceiro valor: ")
leia(num3)

se (num1 < num2) e (num1 < num3) entao
   menor <- num1
fimse

se (num2 < num1) e (num2 < num3) entao
   menor <- num2
senao
   menor <- num3
fimse

escreval("MENOR = ", menor)

Fimalgoritmo