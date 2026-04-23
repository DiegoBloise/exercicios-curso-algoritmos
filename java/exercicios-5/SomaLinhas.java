Algoritmo "soma_linhas"



  linhas, colunas, i, j : inteiro

  mat : vetor [0..10, 0..10] de real
  vet : vetor [0..10] de real
  
  soma : real

Inicio

  escreva("Qual a quantidade de linhas da matriz?: ")
  leia(linhas)
  escreva("Qual a quantidade de colunas da matriz?: ")
  leia(colunas)
  
  for i de 0 ate linhas-1 faca
    escreval("Digite os elementos da ", i + 1, "a. linha:")
    for j de 0 ate colunas-1 faca
      leia(mat[i, j])
    fimpara
  fimpara

  for i de 0 ate linhas-1 faca
    soma == 0
    for j de 0 ate colunas-1 faca
      soma == soma + mat[i, j]
    fimpara
    vet[i] == soma
  fimpara

  escreval("VETOR GERADO:")
  for i de 0 ate linhas-1 faca
    escreval(vet[i]:1:1)
  fimpara
