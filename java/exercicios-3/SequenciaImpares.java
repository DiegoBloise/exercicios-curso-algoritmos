import java.util.Locale;
import java.util.Scanner;

public class SequenciaImpares {

    private int x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SequenciaImpares sequencia = new SequenciaImpares();

        System.out.print("Digite o valor de X: ");
        sequencia.setX(sc.nextInt());

        sequencia.exibirImpares();

        sc.close();
    }

    public void exibirImpares() {
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
