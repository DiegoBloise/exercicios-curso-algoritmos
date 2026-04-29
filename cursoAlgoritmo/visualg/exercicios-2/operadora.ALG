Algoritmo "operadora"

Var


valorPlano   : real
minutosPlano : inteiro
taxaMinutoExcedente : real

totalMinutoUtilizado : inteiro
adicionalExcedente   : real

total : real

Inicio

valorPlano <- 50.0
minutosPlano <- 100
taxaMinutoExcedente <- 2.0

escreva("Digite a quantidade de minutos: ")
leia(totalMinutoUtilizado)

total <- valorPlano

se totalMinutoUtilizado > minutosPlano entao
   adicionalExcedente <- (totalMinutoUtilizado - minutosPlano) * taxaMinutoExcedente
   total <- total + adicionalExcedente
fimse

escreval("Valor a pagar: R$ ", total:2:2)

Fimalgoritmo