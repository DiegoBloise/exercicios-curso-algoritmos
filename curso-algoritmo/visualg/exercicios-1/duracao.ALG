Algoritmo "duracao"

Var

duracao : inteiro
h, m, s : inteiro

Inicio

escreva("Digite a duracao em segundos: ")
leia(duracao)

h <- duracao \ 3600
m <- (duracao % 3600) \ 60
s <- duracao % 60

escreval(h, ":", m, ":", s)

Fimalgoritmo