package cursoJava.secao10.ex09;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MaisVelho maisVelho = new MaisVelho();

        System.out.print("Quantas pessoas voce vai digitar?: ");
        Integer n = sc.nextInt();

        // Limpar buffer
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            maisVelho.getNomes().add(sc.nextLine());

            System.out.print("Idade: ");
            maisVelho.getIdades().add(sc.nextInt());

            // Limpar buffer
            sc.nextLine();
        }

        System.out.println("PESSOA MAIS VELHA: " + maisVelho.getNomeMaisVelho());

        sc.close();
    }
}
