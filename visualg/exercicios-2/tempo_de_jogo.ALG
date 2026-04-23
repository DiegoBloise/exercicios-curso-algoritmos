Algoritmo "tempo_de_jogo"

Var

horaInicial, horaFinal, totalHoras : inteiro

Inicio

escreva("Hora inicial: ")
leia(horaInicial)
escreva("Hora final: ")
leia(horaFinal)

se horaInicial > horaFinal entao
  totalHoras <- (24 - horaInicial) + horaFinal
senao
  se horaFinal == horaInicial entao
    totalHoras <- 24
  senao
    totalHoras <- horaFinal - horaInicial
  fimse
fimse

escreval("O JOGO DUROU ", totalHoras, " HORA(S)")

Fimalgoritmo