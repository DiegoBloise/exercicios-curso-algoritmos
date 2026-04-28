package cursoJava.secao6.parte2;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número para exibir o fatorial: ");

        int n = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
