package cursoJava.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor do raio do círculo: ");

        int raio = sc.nextInt();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("AREA = %.4f%n", area);

        sc.close();
    }
}
