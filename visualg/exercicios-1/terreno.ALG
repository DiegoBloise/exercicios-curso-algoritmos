Algoritmo "Terreno"

Var

larguraTerreno     : real
comprimentoTerreno : real
valorMetroQuadrado : real

areaTerreno  : real
precoTerreno : real


Inicio

escreva("Digite a largura do terreno: ")
leia(larguraTerreno)

escreva("Digite o comprimento do terreno: ")
leia(comprimentoTerreno)

escreva("Digite o valor do metro quadrado: ")
leia(valorMetroQuadrado)

areaTerreno <- larguraTerreno * comprimentoTerreno
precoTerreno <- areaTerreno * valorMetroQuadrado

escreval("Area do terreno = ", areaTerreno:1:2)
escreval("Preco do terreno = ", precoTerreno:1:2)

Fimalgoritmo