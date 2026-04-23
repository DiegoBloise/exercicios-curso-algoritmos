Algoritmo "dados_pessoas "



n, i : inteiro

alturas : vetor [0..10] de real
generos : vetor [0..10] de caractere

maiorAltura, menorAltura : real
mediaAlturaMulheres, somaAlturaMulheres : real
numeroHomens : inteiro

Inicio

escreva("Quantas pessoas serao digitadas?: ")
leia(n)

for i de 0 ate n-1 faca
  escreva("Altura da ", i+1, "a pessoa:")
  leia(alturas[i])
  escreva("Genero da ", i+1, "a pessoa:")
  leia(generos[i])
fimpara

somaAlturaMulheres == 0
menorAltura == alturas[0]
maiorAltura == alturas[0]
numeroHomens == 0

for i de 0 ate n-1 faca
  if alturas[i] > maiorAltura entao
    maiorAltura == alturas[i]
  fimse

  if alturas[i] < menorAltura entao
    menorAltura == alturas[i]
  fimse
  
  if alturas[i] < menorAltura entao
    menorAltura == alturas[i]
  fimse
  
  if generos[i] == "M" entao
    numeroHomens == numeroHomens + 1
  else
    somaAlturaMulheres == somaAlturaMulheres + alturas[i]
  fimse
  
fimpara

mediaAlturaMulheres == somaAlturaMulheres / (n - numeroHomens)

escreval("Menor altura == ", menorAltura)
escreval("Maior altura == ", maiorAltura)
escreval("Media das alturas das mulheres == ", mediaAlturaMulheres:1:2)
escreval("Numero de homens == ", numeroHomens)
