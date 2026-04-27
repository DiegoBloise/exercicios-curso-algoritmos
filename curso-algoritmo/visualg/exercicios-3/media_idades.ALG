Algoritmo "media_idades"

Var

idade : real
soma  : real
media : real
qtd   : inteiro

Inicio

idade <- 0
qtd <- 0

escreval("Digite as idades:")
enquanto idade >= 0 faca
  leia(idade)

  se idade >= 0 entao
    soma <- soma + idade
    qtd <- qtd + 1
  fimse

fimenquanto

se qtd > 1 entao
  media <- soma / qtd
  escreval("MEDIA = ", media:2:2)
senao
    escreval("IMPOSSIVEL CALCULAR")
fimse

Fimalgoritmo
