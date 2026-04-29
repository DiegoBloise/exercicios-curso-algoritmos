Algoritmo "pagamento"

Var

nome             : caractere
valorHora        : real
horasTrabalhadas : real
pagamento        : real

Inicio

escreva("Nome: ")
leia(nome)
escreva("Valor por hora: ")
leia(valorHora)
escreva("Horas trabalhadas: ")
leia(horasTrabalhadas)

pagamento <- valorHora * horasTrabalhadas

escreval("O pagamento para ", nome, " deve ser ", pagamento:1:2)

Fimalgoritmo