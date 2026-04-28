package cursoJava.exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Número de testes: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] entrada = new String[n];

        for (int i = 0; i < n; i++) {
            entrada[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            String[] valores = entrada[i].split(" ");
            double a = Double.parseDouble(valores[0]);
            double b = Double.parseDouble(valores[1]);
            double c = Double.parseDouble(valores[2]);

            double media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
