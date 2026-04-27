Algoritmo "cada_linha"

Var

  n, i, j : inteiro

  mat : vetor [0..10, 0..10] de inteiro

  maiores : vetor [0..10] de inteiro

Inicio

  escreva("Qual a ordem da matriz?: ")
  leia(n)
  
  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(mat[i, j])
    fimpara
  fimpara

  para i de 0 ate n-1 faca
    maiores[i] <- mat[i, j]
    para j de 0 ate n-1 faca
      se mat[i, j] > maiores[i] entao
        maiores[i] <- mat[i, j]
      fimse
    fimpara
  fimpara

  escreval("MAIOR ELEMENTO DE CADA LINHA:")
  para i de 0 ate n-1 faca
    escreval(maiores[i])
  fimpara
Fimalgoritmo
