package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaImpares {

    private Integer x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SequenciaImpares sequencia = new SequenciaImpares();

        System.out.print("Digite o valor de X: ");
        sequencia.setX(sc.nextInt());

        sequencia.exibirImpares();

        sc.close();
    }

    public void exibirImpares() {
        for (Integer i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public Boolean isImpar(Integer i) {
        return i % 2 != 0;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}