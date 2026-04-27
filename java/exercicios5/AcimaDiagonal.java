import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {

    private List<List<Integer>> matriz = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        AcimaDiagonal acimaDiagonal = new AcimaDiagonal();

        System.out.print("Qual a ordem da matriz?: ");
        Integer n = sc.nextInt();

        System.out.println();
        for (int i = 0; i < n; i++) {
            acimaDiagonal.getMatriz().add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                acimaDiagonal.getMatriz().get(i).add(sc.nextInt());
            }
        }
        System.out.println();

        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + acimaDiagonal.getSomaAcimaDiagonal());

        sc.close();
    }

    public Integer getSomaAcimaDiagonal() {
        Integer soma = 0;
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                if (j > i) {
                    soma += matriz.get(i).get(j);
                }
            }
        }
        return soma;
    }

    public List<List<Integer>> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<List<Integer>> matriz) {
        this.matriz = matriz;
    }
}