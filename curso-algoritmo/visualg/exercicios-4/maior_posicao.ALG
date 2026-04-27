Algoritmo "maior_posicao"

Var

n, i : inteiro

numeros : vetor [0..10] de real

maior : real
maiorIndex : inteiro

Inicio

escreva("Quantos numeros voce vai digitar?: ")
leia(n)

para i de 0 ate n-1 faca
  escreva("Digite um numero: ")
  leia(numeros[i])
fimpara

maior <- numeros[0]
maiorIndex <- 0
para i de 0 ate n-1 faca
  se numeros[i] > maior entao
    maior <- numeros[i]
    maiorIndex <- i
  fimse
fimpara

escreval()
escreval("MAIOR VALOR = ", maior:1:1)
escreval("POSICAO DO MAIOR VALOR = ", maiorIndex)

Fimalgoritmo
