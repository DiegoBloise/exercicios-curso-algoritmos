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

        System.out.println();
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", mg.getSomaPositivos());

        System.out.print("ESCOLHA UMA LINHA...: ");
        Integer index = sc.nextInt();

        System.out.print("LINHA ESCOLHIDA.....: ");
        for (Double val : mg.getLinha(index)) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("ESCOLHA UMA COLUNA..: ");
        Integer colIndex = sc.nextInt();

        System.out.print("COLUNA ESCOLHIDA....: ");
        for (Double val : mg.getColuna(colIndex)) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL..: ");
        for (Double val : mg.getDiagonalPrincipal()) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("MATRIZ ALTERADA:");
        for (List<Double> linha : mg.getMatrizAlterada()) {
            for (Double val : linha) {
                System.out.printf("%6.1f ", val);
            }
            System.out.println();
        }

        sc.close();
    }

    public Double getSomaPositivos() {
        Double soma = 0.0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(i).size(); j++) {
                if (mat.get(i).get(j) > 0) {
                    soma += mat.get(i).get(j);
                }
            }
        }
        return soma;
    }

    public List<Double> getLinha(Integer index) {
        return mat.get(index);
    }

    public List<Double> getColuna(Integer index) {
        List<Double> coluna = new ArrayList<>();
        for (int i = 0; i < mat.size(); i++) {
            coluna.add(mat.get(i).get(index));
        }
        return coluna;
    }

    public List<Double> getDiagonalPrincipal() {
        List<Double> diagonal = new ArrayList<>();
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(i).size(); j++) {
                if (i == j) {
                    diagonal.add(mat.get(i).get(j));
                }
            }
        }
        return diagonal;
    }

    public List<List<Double>> getMatrizAlterada() {
        List<List<Double>> alterada = new ArrayList<>();
        for (int i = 0; i < mat.size(); i++) {
            alterada.add(new ArrayList<>());
            for (int j = 0; j < mat.get(i).size(); j++) {
                if (mat.get(i).get(j) < 0) {
                    alterada.get(i).add(Math.pow(mat.get(i).get(j), 2));
                } else {
                    alterada.get(i).add(mat.get(i).get(j));
                }
            }
        }
        return alterada;
    }

    public List<List<Double>> getMat() {
        return mat;
    }

    public void setMat(List<List<Double>> mat) {
        this.mat = mat;
    }
}