import java.util.Locale;
import java.util.Scanner;

public class DentroFora {

    private Integer qtd;
    private Integer dentro;
    private Integer fora;

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

        for (Integer i = 1; i <= qtd; i++) {
            System.out.print("Digite um numero: ");
            Integer numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
    }

    public void processar(Integer[] numeros) {
        dentro = 0;
        fora = 0;

        for (Integer numero : numeros) {
            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Integer getDentro() {
        return dentro;
    }

    public void setDentro(Integer dentro) {
        this.dentro = dentro;
    }

    public Integer getFora() {
        return fora;
    }

    public void setFora(Integer fora) {
        this.fora = fora;
    }
}