package exercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    private List<Double> numeros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MaiorPosicao maiorPosicao = new MaiorPosicao();

        System.out.print("Quanto numeros voce vai digitar?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            maiorPosicao.getNumeros().add(sc.nextDouble());
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maiorPosicao.getMaior());
        System.out.println("POSICAO DO MAIOR VALOR = " + maiorPosicao.getMaiorIndex());

        sc.close();
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }

    public Double getMaior() {
        return numeros.stream().max(Double::compare).get();
    }

    public Integer getMaiorIndex() {
        Integer maiorIndex = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > numeros.get(maiorIndex)) {
                maiorIndex = i;
            }
        }
        return maiorIndex;
    }
}