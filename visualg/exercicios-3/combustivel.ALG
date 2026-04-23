Algoritmo "combustivel"

Var

alcool, gasolina, diesel, opt : inteiro

Inicio

opt <- 0

enquanto opt <> 4 faca
  escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
  leia(opt)

  escolha opt
    caso 1
      alcool <- alcool + 1
    caso 2
      gasolina <- gasolina + 1
    caso 3
      diesel <- diesel + 1
  fimescolha
fimenquanto

escreval("MUITO OBRIGADO")
escreval("Alcool: ", alcool)
escreval("Gasolina: ", gasolina)
escreval("Diesel: ", diesel)

Fimalgoritmo