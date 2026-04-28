package cursoJava.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite as coordenadas (x e y): ");

        String[] coordenadas = sc.nextLine().split(" ");
        double x = Double.parseDouble(coordenadas[0]);
        double y = Double.parseDouble(coordenadas[1]);

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante Q3");
        } else {
            System.out.println("Quadrante Q4");
        }

        sc.close();
    }
}
