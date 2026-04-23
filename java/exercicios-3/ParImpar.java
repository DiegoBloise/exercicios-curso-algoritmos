import java.util.Locale;
import java.util.Scanner;

public class ParImpar {

    private int qtd;
    private int numero;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ParImpar parImpar = new ParImpar();

        System.out.print("Quantos numeros voce vai digitar?: ");
        parImpar.setQtd(sc.nextInt());

        parImpar.classificarNumeros(sc);

        sc.close();
    }

    public void classificarNumeros(Scanner sc) {
        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.print("PAR ");
                } else {
                    System.out.print("IMPAR ");
                }

                if (numero < 0) {
                    System.out.println("NEGATIVO");
                } else {
                    System.out.println("POSITIVO");
                }
            } else {
                System.out.println("NULO");
            }
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
