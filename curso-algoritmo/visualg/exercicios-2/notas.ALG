Algoritmo "notas"

Var

nota1     : real
nota2     : real
notaFinal : real

Inicio

escreva("Digite a primeira nota: ")
leia(nota1)
escreva("Digite a segunda nota: ")
leia(nota2)

notaFinal <- nota1 + nota2

escreval("NOTA FINAL = ", notaFinal)

se (notaFinal < 60) entao
   escreval("REPROVADO")
fimse

Fimalgoritmo