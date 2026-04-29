package exercicios5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {

    private List<List<Integer>> a = new ArrayList<>();
    private List<List<Integer>> b = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SomaMatrizes somaMatrizes = new SomaMatrizes();

        System.out.print("Quantas linhas vai ter cada matriz?: ");
        Integer linhas = sc.nextInt();

        System.out.print("Quantas colunas vai ter cada matriz?: ");
        Integer colunas = sc.nextInt();

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhas; i++) {
            somaMatrizes.getA().add(new ArrayList<>());
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                somaMatrizes.getA().get(i).add(sc.nextInt());
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhas; i++) {
            somaMatrizes.getB().add(new ArrayList<>());
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                somaMatrizes.getB().get(i).add(sc.nextInt());
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (List<Integer> linha : somaMatrizes.getMatrizSoma()) {
            for (Integer val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public List<List<Integer>> getMatrizSoma() {
        List<List<Integer>> soma = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            soma.add(new ArrayList<>());
            for (int j = 0; j < a.get(i).size(); j++) {
                soma.get(i).add(a.get(i).get(j) + b.get(i).get(j));
            }
        }
        return soma;
    }

    public List<List<Integer>> getA() {
        return a;
    }

    public void setA(List<List<Integer>> a) {
        this.a = a;
    }

    public List<List<Integer>> getB() {
        return b;
    }

    public void setB(List<List<Integer>> b) {
        this.b = b;
    }
}
