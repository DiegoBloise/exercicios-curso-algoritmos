package cursoJava.secao6.parte2;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }

        sc.close();
    }
}
