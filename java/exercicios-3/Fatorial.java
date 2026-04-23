import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

    private int n;
    private int total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Fatorial fatorial = new Fatorial();

        System.out.print("Digite o valor de N: ");
        fatorial.setN(sc.nextInt());

        System.out.println("FATORIAL = " + fatorial.calcularFatorial());

        sc.close();
    }

    public int calcularFatorial() {
        total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
