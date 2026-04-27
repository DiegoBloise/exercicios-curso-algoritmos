import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DadosPessoas {

    private List<Double> alturas = new ArrayList<>();
    private List<String> generos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        DadosPessoas dadosPessoas = new DadosPessoas();

        System.out.print("Quantas pessoas serao digitadas?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nAltura da %dª pessoa: ", i + 1);
            dadosPessoas.getAlturas().add(sc.nextDouble());

            // Limpar buffer
            sc.nextLine();

            System.out.printf("Genero da %dª pessoa: ", i + 1);
            dadosPessoas.getGeneros().add(sc.nextLine());
        }

        System.out.println("\nMenor altura = " + dadosPessoas.getMenorAltura());
        System.out.println("Maior altura = " + dadosPessoas.getMaiorAltura());
        System.out.printf("Media das alturas das mulheres = %.2f\n", dadosPessoas.getMediaAlturaMulheres());
        System.out.println("Numero de homens = " + dadosPessoas.getTotalHomens());

        sc.close();
    }

    public Double getMenorAltura() {
        return alturas.stream().min(Double::compare).get();
    }

    public Double getMaiorAltura() {
        return alturas.stream().max(Double::compare).get();
    }

    public Double getMediaAlturaMulheres() {
        return IntStream
                .range(0, alturas.size())
                .filter(i -> generos.get(i).equals("F"))
                .mapToObj(i -> alturas.get(i)).reduce(0.0, Double::sum) / (getAlturas().size() - getTotalHomens());
    }

    public Integer getTotalHomens() {
        return generos.stream().filter((g) -> g.equals("M")).toList().size();
    }

    public List<Double> getAlturas() {
        return alturas;
    }

    public List<String> getGeneros() {
        return generos;
    }
}