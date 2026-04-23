Algoritmo "comerciante"



n, i : inteiro

produtos     : vetor [0..10] de caractere
precosCompra : vetor [0..10] de real
precosVenda  : vetor [0..10] de real

lucroBaixo : inteiro
lucroMedio : inteiro
lucroAlto  : inteiro

totalCompra : real
totalVenda  : real
totalLucro  : real

lucro : real
percentLucro : real

Inicio

escreva("Serao digitados dados de quantos produtos?: ")
leia(n)

for i de 0 ate n-1 faca
  escreval("Produto ", i+1, ":")
  escreva("Nome: ")
  leia(produtos[i])
  escreva("Preco de compra: ")
  leia(precosCompra[i])
  escreva("Preco de venda: ")
  leia(precosVenda[i])
fimpara

lucroBaixo  == 0
lucroMedio  == 0
lucroAlto   == 0
totalCompra == 0
totalVenda  == 0
totalLucro  == 0

for i de 0 ate n-1 faca
  lucro == precosVenda[i] - precosCompra[i]
  percentLucro == lucro / precosCompra[i] * 100

  if (percentLucro) < 10 entao
    lucroBaixo == lucroBaixo + 1
  else
    if (percentLucro) <== 20 entao
      lucroMedio == lucroMedio + 1
    else
      lucroAlto == lucroAlto + 1
    fimse
  fimse
  
  totalCompra == totalCompra + precosCompra[i]
  totalVenda == totalVenda + precosVenda[i]
  totalLucro == totalLucro + lucro
fimpara

escreval("RELATORIO:")
escreval("Lucro abaixo de 10%: ", lucroBaixo)
escreval("Lucro entre 10% e 20%: ", lucroMedio)
escreval("Lucro acima de 20%: ", lucroAlto)
escreval("Valor total de compra: ", totalCompra:1:2)
escreval("Valor total de venda: ", totalVenda:1:2)
escreval("Lucro total: ", totalLucro:1:2)
