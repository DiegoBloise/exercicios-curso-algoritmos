package cursoJava.secao10.ex08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MediaPares mediaPares = new MediaPares();

        System.out.print("Quantos elementos vai ter o vetor?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            mediaPares.getNumeros().add(sc.nextInt());
        }

        if (mediaPares.getTotalPares() > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares.getMediaPares());
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}
