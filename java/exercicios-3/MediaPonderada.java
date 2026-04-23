import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

    private int qtd;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MediaPonderada mediaPonderada = new MediaPonderada();

        System.out.print("Quantos casos voce vai digitar?: ");
        mediaPonderada.setQtd(sc.nextInt());

        mediaPonderada.calcularMediaPonderada(sc);

        sc.close();
    }

    public void calcularMediaPonderada(Scanner sc) {
        for (int i = 1; i <= qtd; i++) {
            System.out.println("Digite tres numeros: ");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10.0;

            System.out.printf("MEDIA = %.1f%n", media);
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
