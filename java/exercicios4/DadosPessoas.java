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
            System.out.printf("Altura da %da pessoa: ", i + 1);
            dadosPessoas.getAlturas().add(sc.nextDouble());

            // Limpar buffer
            sc.nextLine();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            dadosPessoas.getGeneros().add(sc.nextLine());
        }

        System.out.printf("Menor altura = %.2f\n", dadosPessoas.getMenorAltura());
        System.out.printf("Maior altura = %.2f\n", dadosPessoas.getMaiorAltura());
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
        double soma = IntStream
                .range(0, alturas.size())
                .filter(i -> generos.get(i).equals("F"))
                .mapToObj(i -> alturas.get(i))
                .reduce(0.0, Double::sum);
        long qtdMulheres = generos.stream().filter(g -> g.equals("F")).count();
        if (qtdMulheres == 0) {
            return 0.0;
        }
        return soma / qtdMulheres;
    }

    public Integer getTotalHomens() {
        return generos.stream().filter((g) -> g.equals("M")).toList().size();
    }

    public List<Double> getAlturas() {
        return alturas;
    }

    public void setAlturas(List<Double> alturas) {
        this.alturas = alturas;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }
}