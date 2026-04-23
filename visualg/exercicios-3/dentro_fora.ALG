Algoritmo "dentro_fora"

Var

qtd, i, dentro, fora, numero : inteiro

Inicio

escreva("Quantos numeros voce vai digitar?: ")
leia(qtd)

dentro <- 0
fora <- 0

para i de 1 ate qtd faca
  escreva("Digite um numero: ")
  leia(numero)

  se (numero >= 10) e (numero <= 20) entao
    dentro <- dentro + 1
  senao
    fora <- fora + 1
  fimse
fimpara

escreval(dentro, " DENTRO")
escreval(fora, " FORA")

Fimalgoritmo