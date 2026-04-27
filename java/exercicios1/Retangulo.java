import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    private Double baseRetangulo;
    private Double alturaRetangulo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Retangulo retangulo = new Retangulo();

        System.out.print("Base do retangulo: ");
        retangulo.setBaseRetangulo(sc.nextDouble());

        System.out.print("Altura do retangulo: ");
        retangulo.setAlturaRetangulo(sc.nextDouble());

        System.out.printf("\nAREA = %.4f", retangulo.getArea());
        System.out.printf("\nPERIMETRO = %.4f", retangulo.getPerimetro());
        System.out.printf("\nDIAGONAL = %.4f", retangulo.getDiagonal());

        sc.close();
    }

    public Double getArea() {
        return this.baseRetangulo * this.alturaRetangulo;
    }

    public Double getPerimetro() {
        return this.baseRetangulo * 2 + this.alturaRetangulo * 2;
    }

    public Double getDiagonal() {
        return Math.sqrt(Math.pow(this.baseRetangulo, 2) + Math.pow(this.alturaRetangulo, 2));
    }

    public Double getBaseRetangulo() {
        return baseRetangulo;
    }

    public void setBaseRetangulo(Double baseRetangulo) {
        this.baseRetangulo = baseRetangulo;
    }

    public Double getAlturaRetangulo() {
        return alturaRetangulo;
    }

    public void setAlturaRetangulo(Double alturaRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
    }
}
