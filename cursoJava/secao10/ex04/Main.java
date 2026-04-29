package cursoJava.secao10.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        NumerosPares numerosPares = new NumerosPares();

        System.out.print("Quantos numeros voce vai digitar?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numerosPares.getNumeros().add(sc.nextInt());
        }

        System.out.println("\nNUMEROS PARES:");
        for (Integer num : numerosPares.getNumerosPares()) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + numerosPares.getQtdPares());

        sc.close();
    }
}
