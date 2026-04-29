package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

    private Integer n1, n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Multiplos multiplos = new Multiplos();

        System.out.println("Digite dois numeros inteiros: ");
        multiplos.setN1(sc.nextInt());
        multiplos.setN2(sc.nextInt());

        if (multiplos.isMultiplos()) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }

    public Boolean isMultiplos() {
        return (n1 % n2 == 0) || (n2 % n1 == 0);
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }
}