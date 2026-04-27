import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

    private Integer n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Tabuada tabuada = new Tabuada();

        System.out.print("Deseja a tabuada para qual valor?: ");
        tabuada.setN(sc.nextInt());

        tabuada.exibirTabuada();

        sc.close();
    }

    public void exibirTabuada() {
        for (Integer i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %3d = %d", n, i, n * i));
        }
    }

    public String getLinha(Integer i) {
        return String.format("%d x %3d = %d", n, i, n * i);
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}