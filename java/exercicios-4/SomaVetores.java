import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SomaVetores {

    private List<Integer> a = new ArrayList<>();
    private List<Integer> b = new ArrayList<>();
    private List<Integer> c = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaVetores somaVetores = new SomaVetores();

        System.out.print("Quantos valores vai ter cada vetor?: ");
        Integer n = sc.nextInt();

        System.out.println("\nDigite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            somaVetores.getA().add(sc.nextInt());
        }

        System.out.println("\nDigite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            somaVetores.getB().add(sc.nextInt());
        }

        System.out.println("\nVETOR RESULTANTE: " + somaVetores.getVetorResultante().toString());

        sc.close();
    }

    public List<Integer> getVetorResultante() {
        return IntStream.range(0, a.size())
                .mapToObj(i -> a.get(i) + b.get(i)).toList();
    }

    public List<Integer> getA() {
        return a;
    }

    public void setA(List<Integer> a) {
        this.a = a;
    }

    public List<Integer> getB() {
        return b;
    }

    public void setB(List<Integer> b) {
        this.b = b;
    }

    public List<Integer> getC() {
        return c;
    }

    public void setC(List<Integer> c) {
        this.c = c;
    }
}