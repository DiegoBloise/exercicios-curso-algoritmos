Algoritmo "idades"

Var

nomePrimeiraPessoa  : caractere
nomeSegundaPessoa   : caractere

idadePrimeiraPessoa : inteiro
idadeSegundaPessoa  : inteiro

mediaIdade          : real

Inicio

escreval("Dados da primeira pessoa: ")
escreva("Nome: ")
leia(nomePrimeiraPessoa)
escreva("Idade: ")
leia(idadePrimeiraPessoa)


escreval("Dados da segunda pessoa: ")
escreva("Nome: ")
leia(nomeSegundaPessoa)
escreva("Idade: ")
leia(idadeSegundaPessoa)

mediaIdade <- (idadePrimeiraPessoa + idadeSegundaPessoa) / 2

escreval("A idade média de ", nomePrimeiraPessoa, " e ", nomeSegundaPessoa, " é de ", mediaIdade:1:1, " anos")

Fimalgoritmo