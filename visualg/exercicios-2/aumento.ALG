Algoritmo "aumento"

Var

salario, aumento, percent : real

Inicio

escreva("Digite o salario da pessoa: ")
leia(salario)

se salario <= 1000 entao
   percent <- 0.20
fimse

se (salario > 1000) e (salario <= 3000) entao
   percent <- 0.15
fimse

se (salario > 3000) e (salario <= 8000) entao
   percent <- 0.10
fimse

se salario > 8000 entao
   percent <- 0.05
fimse

aumento <- salario * percent

escreval("Novo salario = R$ ", (salario + aumento):2:2)
escreval("Aumento = R$ ", aumento:2:2)
escreval("Porcentagem = ", (percent * 100):2:0, "%")

Fimalgoritmo