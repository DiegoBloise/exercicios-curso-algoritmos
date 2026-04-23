import java.util.Locale;
import java.util.Scanner;

public class Circulo {

    private Double raio;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Circulo circulo = new Circulo();

        System.out.print("Digite o valor do raio do circulo: ");
        circulo.setRaio(sc.nextDouble());

        System.out.printf("AREA = %.3f\n", circulo.getArea());

        sc.close();
    }

    public Double getArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}