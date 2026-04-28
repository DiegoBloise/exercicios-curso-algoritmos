package cursoJava.secao4;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite dois números inteiros:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resultado = num1 + num2;

        System.out.println("SOMA = " + resultado);

        sc.close();
    }
}
