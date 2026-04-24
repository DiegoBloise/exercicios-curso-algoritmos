import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

    private List<Integer> numeros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        NumerosPares numerosPares = new NumerosPares();

        System.out.print("Quantos numeros voce vai digitar?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numerosPares.getNumeros().add(sc.nextInt());
        }

        System.out.println("\nNUMEROS PARES: " + numerosPares.getNumerosPares().toString());
        System.out.println("QUANTIDADE DE PARES: " + numerosPares.getNumerosPares().size());

        sc.close();
    }

    public List<Integer> getNumerosPares() {
        return numeros.stream().filter((n) -> n % 2 == 0).toList();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}
