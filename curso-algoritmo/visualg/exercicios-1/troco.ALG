Algoritmo "troco"

Var

precoUnitario    : real
qtdComprada      : inteiro
dinheiroRecebido : real
troco            : real

Inicio

escreva("Preço unitário do produto: ")
leia(precoUnitario)
escreva("Quantidade comprada: ")
leia(qtdComprada)
escreva("Dinheiro recebido: ")
leia(dinheiroRecebido)

troco <- dinheiroRecebido - (precoUnitario * qtdComprada)

escreval("TROCO = ", troco:1:2)

Fimalgoritmo