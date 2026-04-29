package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

    private Integer x;
    private Integer y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Soma soma = new Soma();

        System.out.print("Digite o valor de X: ");
        soma.setX(sc.nextInt());

        System.out.print("Digite o valor de Y: ");
        soma.setY(sc.nextInt());

        System.out.printf("SOMA = %d", soma.getTotal());

        sc.close();
    }

    public Integer getTotal() {
        return this.x + this.y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getX() {
        return this.x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getY() {
        return this.y;
    }
}
