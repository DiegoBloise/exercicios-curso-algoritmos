import java.util.Locale;
import java.util.Scanner;

public class Crescente {

    private int n1;
    private int n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Crescente crescente = new Crescente();

        System.out.println("Digite dois numeros:");
        crescente.setN1(sc.nextInt());
        crescente.setN2(sc.nextInt());

        while (crescente.getN1() != crescente.getN2()) {
            if (crescente.getN1() > crescente.getN2()) {
                System.out.println("DECRESCENTE!");
            } else {
                System.out.println("CRESCENTE!");
            }

            System.out.println("Digite outros dois numeros:");
            crescente.setN1(sc.nextInt());
            crescente.setN2(sc.nextInt());
        }

        sc.close();
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
