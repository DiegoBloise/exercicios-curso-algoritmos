Algoritmo "experiencias"

Var

sapos, ratos, coelhos, n, i, qtd : inteiro
tipoCobaia: caractere

total : inteiro

Inicio

escreva("Quantos casos de teste serao digitados?: ")
leia(n)

sapos <- 0
coelhos <- 0
ratos <- 0

para i de 1 ate n faca
  escreva("Quantidade de cobaias: ")
  leia(qtd)

  escreva("Tipo de cobaia: ")
  leia(tipoCobaia)
  
  escolha tipoCobaia
    caso "S"
      sapos <- sapos + qtd
    caso "R"
      ratos <- ratos + qtd
    caso "C"
      coelhos <- coelhos + qtd
  fimescolha
fimpara

total <- sapos + ratos + coelhos

escreval()
escreval("RELATORIO FINAL:")
escreval("Total: ", total, " cobaias")
escreval("Total de coelhos: ", coelhos)
escreval("Total de ratos: ", ratos)
escreval("Total de sapos: ", sapos)
escreval("Percentual de coelhos: ", (coelhos / total * 100):1:2)
escreval("Percentual de ratos: ", (ratos / total * 100):1:2)
escreval("Percentual de sapos: ", (sapos / total * 100):1:2)

Fimalgoritmo
