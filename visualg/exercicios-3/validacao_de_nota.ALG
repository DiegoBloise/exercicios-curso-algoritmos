Algoritmo "validacao_de_nota"

Var

n1, n2, media : real

Inicio

n1 <- -1
n2 <- -1

escreva("Digite a primeira nota: ")
enquanto (n1 < 0) ou (n1 > 10) faca
  leia(n1)

  se (n1 < 0) ou (n1 > 10) entao
    escreva("Valor invalido! Tente novamente: ")
  fimse
fimenquanto

escreva("Digite a segunda nota: ")
enquanto (n2 < 0) ou (n2 > 10) faca
  leia(n2)

  se (n2 < 0) ou (n2 > 10) entao
    escreva("Valor invalido! Tente novamente: ")
  fimse
fimenquanto

media <- (n1 + n2) / 2

escreva("MEDIA = ", media:1:2)


Fimalgoritmo