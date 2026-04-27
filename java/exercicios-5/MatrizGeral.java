import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {

    private List<List<Double>> mat = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MatrizGeral mg = new MatrizGeral();

        System.out.print("Qual a ordem da matriz?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            mg.getMat().add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mg.getMat().get(i).add(sc.nextDouble());
            }
        }

        Double somaPositivos = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mg.getMat().get(i).get(j) > 0) {
                    somaPositivos += mg.getMat().get(i).get(j);
                }
            }
        }

        System.out.println();
        System.out.println("SOMA DOS POSITIVOS: " + String.format("%.1f", somaPositivos));
        System.out.println();

        System.out.print("ESCOLHA UMA LINHA...: ");
        Integer index = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA.....: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mg.getMat().get(index).get(i) + " ");
        }
        System.out.println();

        System.out.println();
        System.out.print("ESCOLHA UMA COLUNA..: ");
        Integer colIndex = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA....: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mg.getMat().get(i).get(colIndex) + " ");
        }
        System.out.println();

        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL..: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(mg.getMat().get(i).get(j) + " ");
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mg.getMat().get(i).get(j) < 0) {
                    mg.getMat().get(i).set(j, Math.pow(mg.getMat().get(i).get(j), 2));
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%6.1f ", mg.getMat().get(i).get(j)));
            }
            System.out.println();
        }
        System.out.println();

        sc.close();
    }

    public List<List<Double>> getMat() {
        return mat;
    }

    public void setMat(List<List<Double>> mat) {
        this.mat = mat;
    }
}