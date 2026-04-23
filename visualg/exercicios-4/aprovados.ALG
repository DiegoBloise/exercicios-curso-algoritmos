Algoritmo "aprovados "

Var

n, i : inteiro

alunos : vetor [0..10] de caractere
notas1 : vetor [0..10] de real
notas2 : vetor [0..10] de real

Inicio

escreva("Quantos alunos serao digitados?: ")
leia(n)

para i de 0 ate n-1 faca
  escreval("Digite nome, primeira e segunda nota do ", i+1, "o aluno:")
  leia(alunos[i])
  leia(notas1[i])
  leia(notas2[i])
fimpara

escreval("Alunos aprovados:")

para i de 0 ate n-1 faca
  se ((notas1[i] + notas2[i]) / 2 >= 6) entao
    escreval(alunos[i])
  fimse
fimpara

Fimalgoritmo
