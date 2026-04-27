import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    private List<Integer> numeros = new ArrayList<>();

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

    public Double getMediaPares() {
        if (getTotalPares() == 0) {
            return 0.0;
        }
        return (double) getSomaPares() / getTotalPares();
    }

    public Integer getSomaPares() {
        return numeros.stream().filter((n) -> n % 2 == 0).reduce(0, Integer::sum);
    }

    public Integer getTotalPares() {
        return numeros.stream().filter((n) -> n % 2 == 0).toList().size();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}