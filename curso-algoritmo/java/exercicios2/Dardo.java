import java.util.Locale;
import java.util.Scanner;

public class Dardo {

    private Double d1, d2, d3;
    private Double maior;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Dardo dardo = new Dardo();

        System.out.println("Digite as tres distancias:");
        dardo.setD1(sc.nextDouble());
        dardo.setD2(sc.nextDouble());
        dardo.setD3(sc.nextDouble());

        System.out.printf("MAIOR DISTANCIA = %.2f", dardo.getMaiorDistancia());

        sc.close();
    }

    public Double getMaiorDistancia() {
        if (d1 > d2 && d1 > d3) {
            return d1;
        }

        if (d2 > d1 && d2 > d3) {
            return d2;
        }

        return d3;
    }

    public Double getD1() {
        return d1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public Double getD2() {
        return d2;
    }

    public void setD2(Double d2) {
        this.d2 = d2;
    }

    public Double getD3() {
        return d3;
    }

    public void setD3(Double d3) {
        this.d3 = d3;
    }

    public Double getMaior() {
        return maior;
    }

    public void setMaior(Double maior) {
        this.maior = maior;
    }
}
