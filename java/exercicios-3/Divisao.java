import java.util.Locale;
import java.util.Scanner;

public class Divisao {

    private int qtd;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Divisao divisao = new Divisao();

        System.out.print("Quantos casos voce vai digitar?: ");
        divisao.setQtd(sc.nextInt());

        divisao.realizarDivisoes(sc);

        sc.close();
    }

    public void realizarDivisoes(Scanner sc) {
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Entre com o numerador: ");
            double n1 = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            double n2 = sc.nextDouble();

            if (n1 > 0) {
                System.out.printf("DIVISAO = %.2f%n", n1 / n2);
            } else {
                if (n1 != 0) {
                    System.out.println("DIVISAO IMPOSSIVEL");
                } else {
                    System.out.printf("DIVISAO = %.2f%n", 0.0);
                }
            }
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
