package cursoJava.secao10.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Negativos negativos = new Negativos();

        System.out.print("Quantos numeros voce vai digitar?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            negativos.getNumeros().add(sc.nextInt());
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (Integer num : negativos.getNumerosNegativos()) {
            System.out.println(num);
        }

        sc.close();
    }
}
