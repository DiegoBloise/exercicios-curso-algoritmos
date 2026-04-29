package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

    private Double medida;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Glicose glicose = new Glicose();

        System.out.print("Digite a medida da glicose: ");
        glicose.setMedida(sc.nextDouble());

        System.out.printf("Classificacao: %s", glicose.getClassificacao());

        sc.close();
    }

    public Double getMedida() {
        return medida;
    }

    public void setMedida(Double medida) {
        this.medida = medida;
    }

    public String getClassificacao() {
        if (medida > 100 && medida <= 140) {
            return "elevado";
        }

        if (medida > 140) {
            return "diabetes";
        }

        return "normal";
    }
}
