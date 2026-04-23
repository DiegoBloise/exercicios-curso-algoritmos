import java.util.Locale;
import java.util.Scanner;

public class DentroFora {

    private int qtd;
    private int dentro;
    private int fora;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        DentroFora dentroFora = new DentroFora();

        System.out.print("Quantos numeros voce vai digitar?: ");
        dentroFora.setQtd(sc.nextInt());

        dentroFora.contarDentroFora(sc);
        System.out.println(dentroFora.getDentro() + " DENTRO");
        System.out.println(dentroFora.getFora() + " FORA");

        sc.close();
    }

    public void contarDentroFora(Scanner sc) {
        dentro = 0;
        fora = 0;

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getDentro() {
        return dentro;
    }

    public void setDentro(int dentro) {
        this.dentro = dentro;
    }

    public int getFora() {
        return fora;
    }

    public void setFora(int fora) {
        this.fora = fora;
    }
}
