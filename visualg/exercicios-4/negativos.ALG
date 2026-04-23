Algoritmo "negativos"

Var

n, i : inteiro
numeros : vetor [0..10] de inteiro

Inicio

escreva("Quantos numeros voce vai digitar?: ")
leia(n)

para i de 0 ate n-1 faca
  escreva("Digite um numero: ")
  leia(numeros[i])
fimpara

escreval("NUMEROS NEGATIVOS:")
para i de 0 ate n-1 faca
  se numeros[i] < 0 entao
    escreval(numeros[i])
  fimse
fimpara

Fimalgoritmo
