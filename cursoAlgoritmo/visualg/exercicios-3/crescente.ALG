Algoritmo "crescente"

Var

n1, n2 : inteiro

Inicio

escreval("Digite dois numeros:")
leia(n1)
leia(n2)

enquanto n1 <> n2 faca
  se n1 > n2 entao
    escreval("DECRESCENTE!")
  senao
    escreval("CRESCENTE!")
  fimse
  
  escreval("Digite outros dois numeros:")
  leia(n1)
  leia(n2)

fimenquanto

Fimalgoritmo
