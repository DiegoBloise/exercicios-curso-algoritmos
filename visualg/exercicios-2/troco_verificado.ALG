Algoritmo "troco_verificado"

Var

precoUnitario    : real
qtdComprada      : inteiro
dinheiroRecebido : real

totalCompra : real

troco : real

Inicio

escreva("Preço unitário do produto: ")
leia(precoUnitario)
escreva("Quantidade comprada: ")
leia(qtdComprada)
escreva("Dinheiro recebido: ")
leia(dinheiroRecebido)

totalCompra <- precoUnitario * qtdComprada

se dinheiroRecebido >= totalCompra entao
   troco <- dinheiroRecebido - totalCompra
   escreval("TROCO = ", troco)
senao
   escreval("DINHEIRO INSUFICIENTE. FALTAM ", totalCompra - dinheiroRecebido, " REAIS")
fimse

Fimalgoritmo