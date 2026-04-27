Algoritmo "soma_matrizes"

Var

  m, linhas, colunas, i, j : inteiro

  a, b, soma : vetor [0..10, 0..10] de inteiro

Inicio

  escreva("Quantas linhas vai ter cada matriz?: ")
  leia(linhas)
  escreva("Quantas colunas vai ter cada matriz?: ")
  leia(colunas)

  escreval("Digite os valores da matriz A:")
  para i de 0 ate linhas-1 faca
    para j de 0 ate colunas-1 faca
      escreva("Elemento [", i, ",", j, "]:")
      leia(a[i, j])
    fimpara
  fimpara

  escreval("Digite os valores da matriz B:")
  para i de 0 ate linhas-1 faca
    para j de 0 ate colunas-1 faca
      escreva("Elemento [", i, ",", j, "]:")
      leia(b[i, j])
    fimpara
  fimpara

  para i de 0 ate linhas-1 faca
    para j de 0 ate colunas-1 faca
      soma[0, j] <- a[i, j] + b[i, j]
    fimpara
  fimpara

  escreval("MATRIZ SOMA:")
  para i de 0 ate linhas-1 faca
    para j de 0 ate colunas-1 faca
      escreva(soma[i, j], " ")
    fimpara
    escreval()
  fimpara

Fimalgoritmo
