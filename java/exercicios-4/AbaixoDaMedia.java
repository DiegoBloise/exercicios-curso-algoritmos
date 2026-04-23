import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    private List<Double> numeros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AbaixoDaMedia am = new AbaixoDaMedia();
        Integer n;

        System.out.print("Quantos valores vai ter cada vetor?: ");
        n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            System.out.print("Digite um numero: ");
            am.numeros.add(sc.nextDouble());
        }

        System.out.printf("MEDIA DO VETOR = %.3f", am.getMedia());
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: " + am.getAbaixoMedia());

        sc.close();
    }

    public Double getMedia() {
        Double soma = 0.0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma / numeros.size();
    }

    public List<Double> getAbaixoMedia() {
        return numeros.stream().filter((n) -> n < getMedia()).toList();
    }
}
