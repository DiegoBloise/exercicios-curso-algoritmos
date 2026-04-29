package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

    private Double a;
    private Double b;
    private Double c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Baskara baskara = new Baskara();

        System.out.print("Coeficiente a: ");
        baskara.setA(sc.nextDouble());

        System.out.print("Coeficiente b: ");
        baskara.setB(sc.nextDouble());

        System.out.print("Coeficiente c: ");
        baskara.setC(sc.nextDouble());

        baskara.calcular();

        sc.close();
    }

    public void calcular() {
        Double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            Double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            Double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("\nX1 = %.4f", x1);
            System.out.printf("\nX2 = %.4f", x2);

            return;
        }

        System.out.println("Esta equacao nao possui raizes reais");
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}