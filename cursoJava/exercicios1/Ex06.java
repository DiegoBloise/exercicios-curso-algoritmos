package cursoJava.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite os valores de A, B e C: ");

        String entrada = sc.nextLine();
        String[] dados = entrada.split(" ");

        double a = Double.parseDouble(dados[0]);
        double b = Double.parseDouble(dados[1]);
        double c = Double.parseDouble(dados[2]);

        double triangulo = (a * c) / 2;
        double circulo = Math.PI * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
