package cursoJava.secao8.ex04;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa para ler a cotação do dólar,
    e depois um valor em dólares a ser comprado por uma pessoa em reais.
    Informe quantos reais a pessoa vai pagar pelos dólares,
    considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
    Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
*/
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?: ");
        BigDecimal dollarPrice = sc.nextBigDecimal();

        System.out.print("How many dollars will be bought?: ");
        BigDecimal dollarAmount = sc.nextBigDecimal();

        System.out.printf("Amount to be paid in reais = %.2f\n", CurrencyConverter.convert(dollarAmount, dollarPrice));

        sc.close();
    }
}