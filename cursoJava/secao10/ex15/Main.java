package cursoJava.secao10.ex15;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler dois números inteiros M e N,
    e depois ler uma matriz de M linhas por N colunas contendo números inteiros,
    podendo haver repetições. Em seguida, ler um número inteiro X que pertence à
    matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima,
    à direita e abaixo de X, quando houver, conforme exemplo.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<List<Integer>> matriz = new ArrayList<>();

        System.out.print("Numero de linhas e colunas (Ex: 3 4): ");
        String[] qtdLinhasColunas = sc.nextLine().split(" ");

        Integer totalLinhas = Integer.parseInt(qtdLinhasColunas[0]);
        Integer totalColunas = Integer.parseInt(qtdLinhasColunas[1]);

        for (int linha = 0; linha < totalLinhas; linha++) {
            matriz.add(new ArrayList<>());
            String[] valoresLinha = sc.nextLine().split(" ");
            for (int coluna = 0; coluna < totalColunas; coluna++) {
                matriz.get(linha).add(Integer.parseInt(valoresLinha[coluna]));
            }
        }

        Integer num = sc.nextInt();

        for (int linha = 0; linha < totalLinhas; linha++) {
            for (int coluna = 0; coluna < totalColunas; coluna++) {
                if (matriz.get(linha).get(coluna) == num) {
                    System.out.printf("Position %d,%d:\n", linha, coluna);

                    // Check Left
                    if (coluna - 1 >= 0) {
                        System.out.printf("Left %d:\n", matriz.get(linha).get(coluna - 1));
                    }

                    // Check Right
                    if (coluna + 1 < totalColunas) {
                        System.out.printf("Right %d:\n", matriz.get(linha).get(coluna + 1));
                    }

                    // Check Up
                    if (linha - 1 >= 0) {
                        System.out.printf("Up %d:\n", matriz.get(linha - 1).get(coluna));
                    }

                    // Check Down
                    if (linha + 1 < totalLinhas) {
                        System.out.printf("Down %d:\n", matriz.get(linha + 1).get(coluna));
                    }
                }
            }
        }

        sc.close();
    }
}
