Algoritmo "lanchonete"

Var

codigoProduto, qtdProduto : inteiro
valorProduto, total : real

Inicio

escreva("Codigo do produto comprado: ")
leia(codigoProduto)
escreva("Quantidade comprada: ")
leia(qtdProduto)

escolha codigoProduto
  caso 1
    valorProduto <- 5.00
  caso 2
    valorProduto <- 3.50
  caso 3
    valorProduto <- 4.80
  caso 4
    valorProduto <- 8.90
  caso <- 5
    valorProduto <- 7.32
fimescolha

total <- valorProduto * qtdProduto

escreval("Valor a pagar: R$ ", total:1:2)

Fimalgoritmo