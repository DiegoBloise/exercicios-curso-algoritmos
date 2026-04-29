package cursoJava.secao10.ex07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AbaixoDaMedia am = new AbaixoDaMedia();

        System.out.print("Quantos elementos vai ter o vetor?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            am.getNumeros().add(sc.nextDouble());
        }

        System.out.printf("MEDIA DO VETOR = %.3f\n", am.getMedia());
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (Double num : am.getAbaixoMedia()) {
            System.out.printf("%.1f\n", num);
        }

        sc.close();
    }
}
