package cursoJava.secao10.ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro N e uma matriz de ordem N
    contendo números inteiros. Em seguida, mostrar a diagonal
    principal e a quantidade de valores negativos da matriz.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<List<Integer>> matriz = new ArrayList<>();

        System.out.print("N: ");
        Integer n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            matriz.add(Arrays.asList(
                    Integer.parseInt(input[0]),
                    Integer.parseInt(input[1]),
                    Integer.parseInt(input[2])));
        }

        System.out.print("\nMain diagonal: ");
        for (int i = 0; i < matriz.size(); i++) {
            System.out.print(matriz.get(i).get(i) + " ");
        }

        int negativeNumbers = 0;
        for (List<Integer> line : matriz) {
            for (Integer number : line) {
                if (number < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.print("\nNegative numbers = " + negativeNumbers);

        sc.close();
    }
}
