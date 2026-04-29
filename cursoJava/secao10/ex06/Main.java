import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaVetores somaVetores = new SomaVetores();

        System.out.print("Quantos valores vai ter cada vetor?: ");
        Integer n = sc.nextInt();

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            somaVetores.getA().add(sc.nextInt());
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            somaVetores.getB().add(sc.nextInt());
        }

        System.out.println("VETOR RESULTANTE:");
        for (Integer valor : somaVetores.getVetorResultante()) {
            System.out.println(valor);
        }

        sc.close();
    }
}
