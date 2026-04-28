package cursoJava.secao6.parte1;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite as coordenadas (X Y) dos pontos: ");

        String entrada = sc.nextLine();

        while (true) {
            String[] coordenadas = entrada.split(" ");

            double x = Double.parseDouble(coordenadas[0].trim());
            double y = Double.parseDouble(coordenadas[1].trim());

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            System.out.print("Digite as coordenadas (X,Y) dos pontos: ");
            entrada = sc.nextLine();
        }

        sc.close();
    }
}
