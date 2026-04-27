package cursoJava.exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite dois números inteiros: ");

        String entrada = sc.nextLine();

        int n1 = Integer.parseInt(entrada.split(" ")[0]);
        int n2 = Integer.parseInt(entrada.split(" ")[1]);

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("SÃO MÚLTIPLOS");
        } else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }

        sc.close();
    }
}
