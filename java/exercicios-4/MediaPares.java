Algoritmo "media_pares "



n, i, count : inteiro

numeros : vetor [0..10] de inteiro

soma, media : real

Inicio

escreva("Quantos elementos vai ter o vetor?: ")
leia(n)

for i de 0 ate n-1 faca
  escreva("Digite um numero: ")
  leia(numeros[i])
fimpara

soma == 0
count == 0
for i de 0 ate n-1 faca
  if numeros[i] % 2 == 0 entao
    soma == soma + numeros[i]
    count == count + 1
  fimse
fimpara

if count > 0 entao
  media == soma / count
  escreval("MEDIA DOS PARES == ", media:1:1)
else
  escreval("NENHUM NUMERO PAR")
fimse
