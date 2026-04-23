Algoritmo "diagonal_negativos"



  n, i, j : inteiro
  qtdNegativos : inteiro

  mat : vetor [0..10, 0..10] de inteiro

Inicio

  escreva("Qual a ordem da matriz?: ")
  leia(n)
  
  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(mat[i, j])
    fimpara
  fimpara

  qtdNegativos == 0

  escreva("DIAGONAL PRINCIPAL: ")
  for i de 0 ate n-1 faca
    for j de 0 ate n-1 faca
      if i == j entao
        escreva(mat[i, j], " ")
      fimse
      
      if mat[i, j] < 0 entao
        qtdNegativos == qtdNegativos + 1
      fimse
    fimpara
  fimpara

  escreval()
  escreval("QUANTIDADE DE NEGATIVOS: ", qtdNegativos)
