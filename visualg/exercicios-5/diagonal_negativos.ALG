Algoritmo "diagonal_negativos"

Var

  n, i, j : inteiro
  qtdNegativos : inteiro

  mat : vetor [0..10, 0..10] de inteiro

Inicio

  escreva("Qual a ordem da matriz?: ")
  leia(n)
  
  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(mat[i, j])
    fimpara
  fimpara

  qtdNegativos <- 0

  escreva("DIAGONAL PRINCIPAL: ")
  para i de 0 ate n-1 faca
    para j de 0 ate n-1 faca
      se i = j entao
        escreva(mat[i, j], " ")
      fimse
      
      se mat[i, j] < 0 entao
        qtdNegativos <- qtdNegativos + 1
      fimse
    fimpara
  fimpara

  escreval()
  escreval("QUANTIDADE DE NEGATIVOS: ", qtdNegativos)

Fimalgoritmo
