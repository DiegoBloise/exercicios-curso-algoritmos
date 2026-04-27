import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

    private Integer n;
    private Integer total;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Fatorial fatorial = new Fatorial();

        System.out.print("Digite o valor de N: ");
        fatorial.setN(sc.nextInt());

        System.out.println("FATORIAL = " + fatorial.calcularFatorial());

        sc.close();
    }

    public Integer calcularFatorial() {
        total = 1;
        for (Integer i = 1; i <= n; i++) {
            total = total * i;
        }
        return total;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}