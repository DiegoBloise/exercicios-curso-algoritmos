package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

    private Double a;
    private Double b;
    private Double c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Medidas medidas = new Medidas();

        System.out.print("Digite a medida A: ");
        medidas.setA(sc.nextDouble());
        System.out.print("Digite a medida B: ");
        medidas.setB(sc.nextDouble());
        System.out.print("Digite a medida C: ");
        medidas.setC(sc.nextDouble());

        System.out.printf("\nAREA DO QUADRADO = %.4f", medidas.getAreaQuadrado());
        System.out.printf("\nAREA DO TRIANGULO = %.4f", medidas.getAreaTriangulo());
        System.out.printf("\nAREA DO TRAPEZIO = %.4f", medidas.getAreaTrapezio());

        sc.close();
    }

    public Double getAreaQuadrado() {
        return this.a * this.a;
    }

    public Double getAreaTriangulo() {
        return (this.a * this.b) / 2;
    }

    public Double getAreaTrapezio() {
        return ((this.a + this.b) * this.c) / 2;
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