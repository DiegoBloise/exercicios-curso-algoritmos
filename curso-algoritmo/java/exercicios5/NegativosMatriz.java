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
        for (Integer val : nm.getValoresNegativos()) {
            System.out.println(val);
        }

        sc.close();
    }

    public List<Integer> getValoresNegativos() {
        List<Integer> negativos = new ArrayList<>();
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                if (matriz.get(i).get(j) < 0) {
                    negativos.add(matriz.get(i).get(j));
                }
            }
        }
        return negativos;
    }

    public List<List<Integer>> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<List<Integer>> matriz) {
        this.matriz = matriz;
    }
}