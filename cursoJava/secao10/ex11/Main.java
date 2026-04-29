package cursoJava.secao10.ex11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        DadosPessoas dadosPessoas = new DadosPessoas();

        System.out.print("Quantas pessoas serao digitadas?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            dadosPessoas.getAlturas().add(sc.nextDouble());

            // Limpar buffer
            sc.nextLine();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            dadosPessoas.getGeneros().add(sc.nextLine());
        }

        System.out.printf("Menor altura = %.2f\n", dadosPessoas.getMenorAltura());
        System.out.printf("Maior altura = %.2f\n", dadosPessoas.getMaiorAltura());
        System.out.printf("Media das alturas das mulheres = %.2f\n", dadosPessoas.getMediaAlturaMulheres());
        System.out.println("Numero de homens = " + dadosPessoas.getTotalHomens());

        sc.close();
    }
}
