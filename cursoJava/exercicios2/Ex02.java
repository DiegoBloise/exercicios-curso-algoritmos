package cursoJava.exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");

        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? "PAR" : "ÍMPAR");

        sc.close();
    }
}
