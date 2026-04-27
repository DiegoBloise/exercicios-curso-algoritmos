import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    private List<Double> numeros = new ArrayList<>();

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

    public Double getSoma() {
        return numeros.stream().reduce(0.0, Double::sum);
    }

    public Double getMedia() {
        return getSoma() / numeros.size();
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }
}
