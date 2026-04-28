package cursoJava.exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(n % i == 0 ? i + "\n" : "");
        }

        sc.close();
    }
}
