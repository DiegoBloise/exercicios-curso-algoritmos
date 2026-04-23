Algoritmo "media_pares "

Var

n, i, count : inteiro

numeros : vetor [0..10] de inteiro

soma, media : real

Inicio

escreva("Quantos elementos vai ter o vetor?: ")
leia(n)

para i de 0 ate n-1 faca
  escreva("Digite um numero: ")
  leia(numeros[i])
fimpara

soma <- 0
count <- 0
para i de 0 ate n-1 faca
  se numeros[i] % 2 = 0 entao
    soma <- soma + numeros[i]
    count <- count + 1
  fimse
fimpara

se count > 0 entao
  media <- soma / count
  escreval("MEDIA DOS PARES = ", media:1:1)
senao
  escreval("NENHUM NUMERO PAR")
fimse

Fimalgoritmo
