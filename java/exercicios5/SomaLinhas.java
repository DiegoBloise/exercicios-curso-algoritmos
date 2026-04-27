import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {

    private List<List<Double>> matriz = new ArrayList<>();
    private List<Double> vetor = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaLinhas somaLinhas = new SomaLinhas();

        System.out.print("Qual a quantidade de linhas da matriz?: ");
        int linhas = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz?: ");
        int colunas = sc.nextInt();

        for (int i = 0; i < linhas; i++) {
            List<Double> linha = new ArrayList<>();
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha:");
            for (int j = 0; j < colunas; j++) {
                linha.add(sc.nextDouble());
            }
            somaLinhas.getMatriz().add(linha);
        }

        for (int i = 0; i < linhas; i++) {
            Double soma = 0.0;
            for (int j = 0; j < colunas; j++) {
                soma += somaLinhas.getMatriz().get(i).get(j);
            }
            somaLinhas.getVetor().add(soma);
        }

        System.out.println("VETOR GERADO:");
        for (Double elemento : somaLinhas.getVetor()) {
            System.out.printf("%.1f%n", elemento);
        }

        sc.close();
    }

    public List<List<Double>> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<List<Double>> matriz) {
        this.matriz = matriz;
    }

    public List<Double> getVetor() {
        return vetor;
    }

    public void setVetor(List<Double> vetor) {
        this.vetor = vetor;
    }
}
