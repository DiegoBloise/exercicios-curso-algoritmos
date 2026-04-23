Algoritmo "soma_linhas"

Var

  linhas, colunas, i, j : inteiro

  mat : vetor [0..10, 0..10] de real
  vet : vetor [0..10] de real
  
  soma : real

Inicio

  escreva("Qual a quantidade de linhas da matriz?: ")
  leia(linhas)
  escreva("Qual a quantidade de colunas da matriz?: ")
  leia(colunas)
  
  para i de 0 ate linhas-1 faca
    escreval("Digite os elementos da ", i + 1, "a. linha:")
    para j de 0 ate colunas-1 faca
      leia(mat[i, j])
    fimpara
  fimpara

  para i de 0 ate linhas-1 faca
    soma <- 0
    para j de 0 ate colunas-1 faca
      soma <- soma + mat[i, j]
    fimpara
    vet[i] <- soma
  fimpara

  escreval("VETOR GERADO:")
  para i de 0 ate linhas-1 faca
    escreval(vet[i]:1:1)
  fimpara

Fimalgoritmo
