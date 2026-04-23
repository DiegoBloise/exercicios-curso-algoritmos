Algoritmo "matriz_geral"



  n, i, j : inteiro

  mat : vetor [0..10, 0..10] de real
  
  somaPositivos : real
  
  index : inteiro

Inicio

  escreva("Qual a ordem da matriz?: ")
  leia(n)

  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]:")
      leia(mat[i, j])
    fimpara
  fimpara

  escreval()
  somaPositivos == 0
  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      if (mat[i, j] > 0) entao
        somaPositivos == somaPositivos + mat[i, j]
      fimse
    fimpara
  fimpara
  escreval("SOMA DOS POSITIVOS: ", somaPositivos:1:1)

  escreval()
  escreva("ESCOLHA UMA LINHA...: ")
  leia(index)
  escreva("LINHA ESCOLHIDA.....: ")
  for i de 0 ate n-1 faca
    escreva(mat[index, i]:1:1, " ")
  fimpara
  escreval()

  escreval()
  escreva("ESCOLHA UMA COLUNA..: ")
  leia(index)
  escreva("COLUNA ESCOLHIDA....: ")
  for i de 0 ate n-1 faca
    escreva(mat[i, index]:1:1, " ")
  fimpara
  escreval()

  escreval()
  escreva("DIAGONAL PRINCIPAL..: ")
  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      if j == i entao
        escreva(mat[i, j]:2:1, " ")
      fimse
    fimpara
  fimpara
  escreval()

  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      if (mat[i, j] < 0) entao
        mat[i, j] == mat[i, j] ^ 2
      fimse
    fimpara
  fimpara

  escreval()
  escreval("MATRIZ ALTERADA:")
  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      escreva(mat[i, j]:6:1, " ")
    fimpara
    escreval()
  fimpara
