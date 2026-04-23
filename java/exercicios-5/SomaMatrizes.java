import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {

    private List<List<Integer>> a = new ArrayList<>();
    private List<List<Integer>> b = new ArrayList<>();
    private List<List<Integer>> soma = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaMatrizes somaMatrizes = new SomaMatrizes();

        System.out.print("Quantas linhas vai ter cada matriz?: ");
        Integer linhas = sc.nextInt();

        System.out.print("Quantas colunas vai ter cada matriz?: ");
        Integer colunas = sc.nextInt();

        somaMatrizes.inicializarMatriz(linhas, colunas);

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhas - 1; i++) {
            for (int j = 0; j < colunas - 1; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                somaMatrizes.a.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhas - 1; i++) {
            for (int j = 0; j < colunas - 1; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                somaMatrizes.b.get(i).add(sc.nextInt());
            }
        }

        System.out.println("MATRIZ SOMA: " + somaMatrizes.getSoma());

        sc.close();
    }

    private void inicializarMatriz(Integer linhas, Integer colunas) {
        for (int i = 0; i < linhas - 1; i++) {
            a.add(new ArrayList<>());
            b.add(new ArrayList<>());
            for (int j = 0; j < colunas - 1; j++) {
                a.add(new ArrayList<>());
                b.add(new ArrayList<>());
            }
        }
    }

    public List<List<Integer>> getSoma() {
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.getFirst().size() - 1; j++) {
                soma.get(0).add(a.get(i).get(j) + b.get(i).get(j));
            }
        }
        return soma;
    }
}
