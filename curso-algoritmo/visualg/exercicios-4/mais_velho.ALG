Algoritmo "mais_velho "

Var

n, i : inteiro

nomes  : vetor [0..10] de caractere
idades : vetor [0..10] de inteiro

maisVelhoIndex, idadeMaisVelho : inteiro

Inicio

escreva("Quantas pessoas voce vai digitar?: ")
leia(n)

para i de 0 ate n-1 faca
  escreval("Dados da ", i+1, "a pessoa:")
  escreva("Nome: ")
  leia(nomes[i])
  escreva("Idade: ")
  leia(idades[i])
fimpara

maisVelhoIndex <- 0
idadeMaisVelho <- idades[maisVelhoIndex]
para i de 0 ate n-1 faca
  se idades[i] > idadeMaisVelho entao
    idadeMaisVelho <- idades[i]
    maisVelhoIndex <- i
  fimse
fimpara

escreval("PESSOA MAIS VELHA: ", nomes[maisVelhoIndex])

Fimalgoritmo
