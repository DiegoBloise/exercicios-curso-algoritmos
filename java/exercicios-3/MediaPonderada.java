import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MediaPonderada mediaPonderada = new MediaPonderada();

        System.out.print("Quantos casos voce vai digitar?: ");
        Integer qtd = sc.nextInt();

        for (Integer i = 1; i <= qtd; i++) {
            System.out.println("Digite tres numeros: ");
            Double n1 = sc.nextDouble();
            Double n2 = sc.nextDouble();
            Double n3 = sc.nextDouble();

            System.out.printf("MEDIA = %.1f%n", mediaPonderada.calcularMedia(n1, n2, n3));
        }

        sc.close();
    }

    public Double calcularMedia(Double n1, Double n2, Double n3) {
        return (n1 * 2 + n2 * 3 + n3 * 5) / 10.0;
    }
}