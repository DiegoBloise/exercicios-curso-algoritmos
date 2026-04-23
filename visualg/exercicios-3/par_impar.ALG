Algoritmo "par_impar"

Var

qtd, i, numero : inteiro

Inicio

escreva("Quantos numeros voce vai digitar?: ")
leia(qtd)

para i de 1 ate qtd faca
  escreva("Digite um numero: ")
  leia(numero)
  
  se numero <> 0 entao
    se numero % 2 = 0 entao
      escreva("PAR ")
    senao
      escreva("IMPAR ")
    fimse

    se numero < 0 entao
      escreval("NEGATIVO")
    senao
      escreval("POSITIVO")
    fimse
  senao
    escreval("NULO")
  fimse

fimpara

Fimalgoritmo