Algoritmo "pares_consecutivos"

Var

valor, soma, count : inteiro

Inicio

valor <- 1

enquanto valor <> 0 faca
  escreva("Digite um numero inteiro: ")
  leia(valor)
  se valor <> 0 entao
    se valor % 2 <> 0 entao
      valor <- valor + 1
    fimse
    soma <- (valor * 5) + 20
    escreval("SOMA = ", soma)
  fimse
fimenquanto

Fimalgoritmo