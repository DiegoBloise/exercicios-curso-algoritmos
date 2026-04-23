Algoritmo "numeros_pares"

Var

n, i, count, numero  : inteiro
numerosPares : vetor [0..10] de inteiro

Inicio

escreva("Quantos numeros voce vai digitar?: ")
leia(n)

count <- 0
para i de 0 ate n-1 faca
  escreva("Digite um numero: ")
  leia(numero)

  se numero % 2 = 0 entao
    numerosPares[count] <- numero
    count <- count + 1
  fimse
fimpara

escreval("NUMEROS PARES:")
para i de 0 ate count-1 faca
  escreva(numerosPares[i], " ")
fimpara

escreval()
escreval("QUANTIDADE DE PARES = ", count)

Fimalgoritmo
