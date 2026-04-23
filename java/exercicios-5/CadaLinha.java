Algoritmo "cada_linha"



  n, i, j : inteiro

  mat : vetor [0..10, 0..10] de inteiro

  maiores : vetor [0..10] de inteiro

Inicio

  escreva("Qual a ordem da matriz?: ")
  leia(n)
  
  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(mat[i, j])
    fimpara
  fimpara

  for i de 0 ate n-1 faca
    maiores[i] == mat[i, j]
    for j de 0 ate n-1 faca
      if mat[i, j] > maiores[i] entao
        maiores[i] == mat[i, j]
      fimse
    fimpara
  fimpara

  escreval("MAIOR ELEMENTO DE CADA LINHA:")
  for i de 0 ate n-1 faca
    escreval(maiores[i])
  fimpara
