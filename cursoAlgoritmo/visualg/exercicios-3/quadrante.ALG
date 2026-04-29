Algoritmo "quadrante"

Var

x, y : real
msg : caractere

Inicio

x <- 1
y <- 1

enquanto (x <> 0) ou (y <> 0) faca
  escreval("Digite os valores das coordenadas X e Y:")
  leia(x)
  leia(y)

  se x > 0 entao
    se y < 0 entao
      msg <- "QUADRANTE Q4"
    senao
      msg <- "QUADRANTE Q1"
    fimse
  fimse

  se x < 0 entao
    se y > 0 entao
      msg <- "QUADRANTE Q2"
    senao
      msg <- "QUADRANTE Q3"
    fimse
  fimse

  se (x <> 0) ou (y <> 0) entao
    escreval(msg)
  fimse
fimenquanto

Fimalgoritmo
