package exercicios5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {

    private List<List<Integer>> matriz = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        DiagonalNegativos diagonalNegativos = new DiagonalNegativos();

        System.out.print("Qual a ordem da matriz?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            diagonalNegativos.getMatriz().add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                diagonalNegativos.getMatriz().get(i).add(sc.nextInt());
            }
        }

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (Integer val : diagonalNegativos.getDiagonalPrincipal()) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("QUANTIDADE DE NEGATIVOS = " + diagonalNegativos.getTotalNegativos());

        sc.close();
    }

    public Integer getTotalNegativos() {
        Integer totalNegativos = 0;
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                if (matriz.get(i).get(j) < 0) {
                    totalNegativos++;
                }
            }
        }
        return totalNegativos;
    }

    public List<Integer> getDiagonalPrincipal() {
        List<Integer> diagonalPrincipal = new ArrayList<>();
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                if (j == i) {
                    diagonalPrincipal.add(matriz.get(i).get(j));
                }
            }
        }
        return diagonalPrincipal;
    }

    public List<List<Integer>> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<List<Integer>> matriz) {
        this.matriz = matriz;
    }
}