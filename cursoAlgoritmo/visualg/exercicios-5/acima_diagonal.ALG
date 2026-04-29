Algoritmo "acima_diagonal"

Var

  n, i, j, soma : inteiro

  mat : vetor [0..10, 0..10] de inteiro

Inicio

  escreva("Qual a ordem da matriz?: ")
  leia(n)

  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]:")
      leia(mat[i, j])
    fimpara
  fimpara

  escreval()
  soma <- 0
  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      se j > i entao
        soma <- soma + mat[i, j]
        escreva(mat[i, j]:2, " ")
      senao
        escreva(" - ")
      fimse
    fimpara
    escreval()
  fimpara
  escreval()

  escreval("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ", soma)

Fimalgoritmo
