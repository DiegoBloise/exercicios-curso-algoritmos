import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Negativos {

    private List<Integer> numeros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Negativos negativos = new Negativos();

        System.out.print("Quantos numeros voce vai digitar?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            negativos.getNumeros().add(sc.nextInt());
        }

        System.out.println("NUMEROS NEGATIVOS: " + negativos.getNumerosNegativos().toString());

        sc.close();
    }

    public List<Integer> getNumerosNegativos() {
        return numeros.stream().filter((n) -> n < 0).toList();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}