import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

    private int x;
    private int y;
    private int soma;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaImpares somaImpares = new SomaImpares();

        System.out.println("Digite dois numeros:");
        somaImpares.setX(sc.nextInt());
        somaImpares.setY(sc.nextInt());

        somaImpares.calcularSomaImpares();
        System.out.println("SOMA DOS IMPARES: " + somaImpares.getSoma());

        sc.close();
    }

    public void calcularSomaImpares() {
        int step = x < y ? 1 : -1;
        soma = 0;

        for (int i = x; (step > 0 && i <= y) || (step < 0 && i >= y); i += step) {
            if (i % 2 != 0 && i != x && i != y) {
                soma += i;
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
