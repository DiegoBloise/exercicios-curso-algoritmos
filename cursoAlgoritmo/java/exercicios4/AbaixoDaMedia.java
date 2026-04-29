package exercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    private List<Double> numeros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AbaixoDaMedia am = new AbaixoDaMedia();

        System.out.print("Quantos elementos vai ter o vetor?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            am.getNumeros().add(sc.nextDouble());
        }

        System.out.printf("MEDIA DO VETOR = %.3f\n", am.getMedia());
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (Double num : am.getAbaixoMedia()) {
            System.out.printf("%.1f\n", num);
        }

        sc.close();
    }

    public Double getMedia() {
        Double soma = 0.0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma / numeros.size();
    }

    public List<Double> getAbaixoMedia() {
        return numeros.stream().filter((n) -> n < getMedia()).toList();
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }
}
