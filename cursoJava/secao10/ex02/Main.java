package cursoJava.secao10.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaVetor somaVetor = new SomaVetor();

        System.out.print("Quantos numeros voce vai digitar?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            somaVetor.getNumeros().add(sc.nextDouble());
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < somaVetor.getNumeros().size(); i++) {
            System.out.printf("%.1f ", somaVetor.getNumeros().get(i));
        }
        System.out.println();
        System.out.printf("SOMA = %.2f\n", somaVetor.getSoma());
        System.out.printf("MEDIA = %.2f\n", somaVetor.getMedia());

        sc.close();
    }
}
