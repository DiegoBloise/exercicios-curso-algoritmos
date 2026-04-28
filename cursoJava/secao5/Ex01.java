package cursoJava.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");

        int n = sc.nextInt();

        System.out.println(n < 0 ? "NEGATIVO" : "NÃO NEGATIVO");

        sc.close();
    }
}
