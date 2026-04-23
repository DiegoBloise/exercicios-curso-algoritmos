Algoritmo "alturas"

Var

n, i, count : inteiro
nomes   : vetor [0..10] de caractere
idades  : vetor [0..10] de inteiro
alturas : vetor [0..10] de real

nomesMenores : vetor [0..10] de caractere
qtdMenores : inteiro

soma, media : real

Inicio

escreva("Quantas pessoas serao digitadas?: ")
leia(n)

para i de 0 ate n-1 faca
  escreval("Dados da ", i+1, "a pessoa: ")
  escreva("Nome: ")
  leia(nomes[i])
  escreva("Idade: ")
  leia(idades[i])
  escreva("Altura: ")
  leia(alturas[i])
fimpara

soma <- 0
para i de 0 ate n-1 faca
  soma <- soma + alturas[i]
fimpara
media <- soma / n

count <- 0
para i de 0 ate n-1 faca
  se idades[i] < 16 entao
    nomesMenores[count] <- nomes[i]
    count <- count + 1
  fimse
fimpara

escreval()
escreval("Altura media: ", media:1:2)
escreval("Pessoas com menos de 16 anos: ", (count / n * 100):1:1, "%")
para i de 0 ate n-1 faca
  escreval(nomesMenores[i])
fimpara

Fimalgoritmo
