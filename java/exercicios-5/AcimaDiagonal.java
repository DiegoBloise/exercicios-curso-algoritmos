Algoritmo "acima_diagonal"



  n, i, j, soma : inteiro

  mat : vetor [0..10, 0..10] de inteiro

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
  soma == 0
  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      if j > i entao
        soma == soma + mat[i, j]
        escreva(mat[i, j]:2, " ")
      else
        escreva(" - ")
      fimse
    fimpara
    escreval()
  fimpara
  escreval()

  escreval("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL == ", soma)
