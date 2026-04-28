package cursoJava.exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantidade de casos: ");

        int n = sc.nextInt();
        sc.nextLine();

        String[] entrada = new String[n];
        for (int i = 0; i < n; i++) {
            entrada[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            String[] valores = entrada[i].split(" ");
            int a = Integer.parseInt(valores[0]);
            int b = Integer.parseInt(valores[1]);

            System.out.println(b == 0 ? "divisao impossivel" : (double) a / b);
        }

        sc.close();
    }
}
