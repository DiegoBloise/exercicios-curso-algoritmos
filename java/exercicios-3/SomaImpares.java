import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

    private Integer x;
    private Integer y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaImpares somaImpares = new SomaImpares();

        System.out.println("Digite dois numeros:");
        somaImpares.setX(sc.nextInt());
        somaImpares.setY(sc.nextInt());

        System.out.println("SOMA DOS IMPARES = " + somaImpares.getSoma());

        sc.close();
    }

    public Integer getSoma() {
        Integer menor = Math.min(x, y);
        Integer maior = Math.max(x, y);
        Integer soma = 0;

        for (Integer i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return soma;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}