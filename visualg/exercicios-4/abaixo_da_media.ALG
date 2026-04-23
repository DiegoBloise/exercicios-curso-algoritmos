Algoritmo "abaixo_da_media"

Var

n, i : inteiro

numeros : vetor [0..10] de real

soma, media : real

Inicio

escreva("Quantos valores vai ter cada vetor?: ")
leia(n)

para i de 0 ate n-1 faca
  escreva("Digite um numero: ")
  leia(numeros[i])
fimpara

soma <- 0
para i de 0 ate n-1 faca
  soma <- soma + numeros[i]
fimpara

media <- soma / n

escreval("MEDIA DO VETOR = ", media:1:3)
escreval("ELEMENTOS ABAIXO DA MEDIA:")
para i de 0 ate n-1 faca
  se numeros[i] < media entao
    escreval(numeros[i])
  fimse
fimpara

Fimalgoritmo
