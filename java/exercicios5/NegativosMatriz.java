import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NegativosMatriz {

    private List<List<Integer>> matriz = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        NegativosMatriz nm = new NegativosMatriz();

        System.out.print("Qual a quantidade de linhas da matriz?: ");
        int linhas = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz?: ");
        int colunas = sc.nextInt();

        for (int i = 0; i < linhas; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                linha.add(sc.nextInt());
            }
            nm.getMatriz().add(linha);
        }

        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (nm.getMatriz().get(i).get(j) < 0) {
                    System.out.println(nm.getMatriz().get(i).get(j));
                }
            }
        }

        sc.close();
    }

    public List<List<Integer>> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<List<Integer>> matriz) {
        this.matriz = matriz;
    }
}