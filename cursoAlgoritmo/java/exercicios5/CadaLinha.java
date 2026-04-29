package exercicios5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {

    private List<List<Integer>> matriz = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        CadaLinha cadaLinha = new CadaLinha();

        System.out.print("Qual a ordem da matriz?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            cadaLinha.getMatriz().add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                cadaLinha.getMatriz().get(i).add(sc.nextInt());
            }
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (Integer val : cadaLinha.getMaiorCadaLinha()) {
            System.out.println(val);
        }

        sc.close();
    }

    public List<Integer> getMaiorCadaLinha() {
        List<Integer> maiores = new ArrayList<>();
        for (int i = 0; i < matriz.size(); i++) {
            Integer maior = matriz.get(i).get(0);
            for (int j = 1; j < matriz.get(i).size(); j++) {
                if (matriz.get(i).get(j) > maior) {
                    maior = matriz.get(i).get(j);
                }
            }
            maiores.add(maior);
        }
        return maiores;
    }

    public List<List<Integer>> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<List<Integer>> matriz) {
        this.matriz = matriz;
    }
}