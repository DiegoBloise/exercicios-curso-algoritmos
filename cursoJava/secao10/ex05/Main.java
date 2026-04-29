import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MaiorPosicao maiorPosicao = new MaiorPosicao();

        System.out.print("Quanto numeros voce vai digitar?: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            maiorPosicao.getNumeros().add(sc.nextDouble());
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maiorPosicao.getMaior());
        System.out.println("POSICAO DO MAIOR VALOR = " + maiorPosicao.getMaiorIndex());

        sc.close();
    }
}
