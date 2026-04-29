Algoritmo "soma_vetor"

Var

n, i : inteiro
numeros : vetor [0..10] de real

soma, media : real

Inicio

escreva("Quantos numeros voce vai digitar?: ")
leia(n)

para i de 0 ate n-1 faca
  escreva("Digite um numero: ")
  leia(numeros[i])
fimpara

escreval()
escreva("VALORES: ")
para i de 0 ate n-1 faca
  escreva(numeros[i]:1:1, " ")
fimpara

soma <- 0
para i de 0 ate n-1 faca
  soma <- soma + numeros[i]
fimpara
media <- soma / n

escreval()
escreval("SOMA = ", soma:1:2)
escreval("MEDIA = ", media:1:2)

Fimalgoritmo
