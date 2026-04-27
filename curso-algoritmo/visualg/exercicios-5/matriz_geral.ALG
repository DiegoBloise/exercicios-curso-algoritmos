Algoritmo "matriz_geral"

Var

  n, i, j : inteiro

  mat : vetor [0..10, 0..10] de real
  
  somaPositivos : real
  
  index : inteiro

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
  somaPositivos <- 0
  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      se (mat[i, j] > 0) entao
        somaPositivos <- somaPositivos + mat[i, j]
      fimse
    fimpara
  fimpara
  escreval("SOMA DOS POSITIVOS: ", somaPositivos:1:1)

  escreval()
  escreva("ESCOLHA UMA LINHA...: ")
  leia(index)
  escreva("LINHA ESCOLHIDA.....: ")
  para i de 0 ate n-1 faca
    escreva(mat[index, i]:1:1, " ")
  fimpara
  escreval()

  escreval()
  escreva("ESCOLHA UMA COLUNA..: ")
  leia(index)
  escreva("COLUNA ESCOLHIDA....: ")
  para i de 0 ate n-1 faca
    escreva(mat[i, index]:1:1, " ")
  fimpara
  escreval()

  escreval()
  escreva("DIAGONAL PRINCIPAL..: ")
  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      se j = i entao
        escreva(mat[i, j]:2:1, " ")
      fimse
    fimpara
  fimpara
  escreval()

  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      se (mat[i, j] < 0) entao
        mat[i, j] <- mat[i, j] ^ 2
      fimse
    fimpara
  fimpara

  escreval()
  escreval("MATRIZ ALTERADA:")
  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      escreva(mat[i, j]:6:1, " ")
    fimpara
    escreval()
  fimpara
Fimalgoritmo
