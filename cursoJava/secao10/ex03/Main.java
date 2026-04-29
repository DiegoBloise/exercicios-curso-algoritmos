package cursoJava.secao10.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Alturas alturas = new Alturas();

        System.out.print("Quantas pessoas serao digitadas?: ");
        Integer n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            alturas.getNomes().add(sc.nextLine());

            System.out.print("Idade: ");
            alturas.getIdades().add(sc.nextInt());

            System.out.print("Altura: ");
            alturas.getAlturas().add(sc.nextDouble());

            sc.nextLine();
        }

        System.out.printf("Altura media: %.2f\n", alturas.getMedia());
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", alturas.getPorcentagemMenores());
        System.out.println("Nomes:");
        for (String nome : alturas.getNomesMenores()) {
            System.out.println(nome);
        }

        sc.close();
    }
}
