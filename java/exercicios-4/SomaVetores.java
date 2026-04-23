Algoritmo "soma_vetores"



n, i : inteiro

a, b, c : vetor [0..10] de inteiro

Inicio

escreva("Quantos valores vai ter cada vetor?: ")
leia(n)

escreva("Digite os valores do vetor A: ")
for i de 0 ate n-1 faca
  leia(a[i])
fimpara

escreva("Digite os valores do vetor B: ")
for i de 0 ate n-1 faca
  leia(b[i])
fimpara

for i de 0 ate n-1 faca
  c[i] == a[i] + b[i]
fimpara

escreval("VETOR RESULTANTE:")
for i de 0 ate n-1 faca
  escreval(c[i])
fimpara
