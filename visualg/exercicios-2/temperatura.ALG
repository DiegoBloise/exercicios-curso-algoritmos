Algoritmo "temperatura"

Var

escala : caractere
temp, convertedTemp : real

Inicio

escreva("Voce vai digitar a temperatura em qual escala (C/F)?: ")
leia(escala)

escolha escala
caso "F"
   escreva("Digite a temperatura em Fahrenheit: ")
   leia(temp)

   convertedTemp <- (temp - 32) * 5 / 9
   escreva("Temperatura equivalente em Celsius: ", convertedTemp:1:2)
caso "C"
   escreva("Digite a temperatura em Celsius: ")
   leia(temp)

   convertedTemp <- (temp * 9 / 5) + 32
   escreva("Temperatura equivalente em Fahrenheit: ", convertedTemp:1:2)
fimescolha

Fimalgoritmo