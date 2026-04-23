import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {

    private int valor;
    private int soma;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ParesConsecutivos paresConsecutivos = new ParesConsecutivos();

        paresConsecutivos.processar(sc);

        sc.close();
    }

    public void processar(Scanner sc) {
        valor = 1;

        while (valor != 0) {
            System.out.print("Digite um numero inteiro: ");
            valor = sc.nextInt();

            if (valor != 0) {
                if (valor % 2 != 0) {
                    valor = valor + 1;
                }
                soma = (valor * 5) + 20;
                System.out.println("SOMA = " + soma);
            }
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
