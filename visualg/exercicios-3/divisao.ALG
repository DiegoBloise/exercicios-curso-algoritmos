Algoritmo "divisao"

Var

qtd, i : inteiro
n1, n2 : real

Inicio

escreva("Quantos casos voce vai digitar?: ")
leia(qtd)

para i de 1 ate qtd faca
  escreva("Entre com o numerador: ")
  leia(n1)
  escreva("Entre com o denominador: ")
  leia(n2)

  se n1 > 0 entao
    escreval("DIVISAO = ", (n1 / n2):1:2)
  senao
    se n1 <> 0 entao
      escreval("DIVISAO IMPOSSIVEL")
    senao
      escreval("DIVISAO = ", 0:1:2)
    fimse
  fimse
fimpara

Fimalgoritmo
