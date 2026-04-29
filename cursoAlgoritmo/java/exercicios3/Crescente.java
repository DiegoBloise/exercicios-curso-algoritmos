package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

    private Integer n1;
    private Integer n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Crescente crescente = new Crescente();

        System.out.println("Digite dois numeros:");
        crescente.setN1(sc.nextInt());
        crescente.setN2(sc.nextInt());

        while (!crescente.isFim()) {
            System.out.println(crescente.getResultado());
            System.out.println("Digite outros dois numeros:");
            crescente.setN1(sc.nextInt());
            crescente.setN2(sc.nextInt());
        }

        sc.close();
    }

    public String getResultado() {
        if (n1 > n2) {
            return "DECRESCENTE!";
        } else {
            return "CRESCENTE!";
        }
    }

    public Boolean isFim() {
        return n1 == n2;
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