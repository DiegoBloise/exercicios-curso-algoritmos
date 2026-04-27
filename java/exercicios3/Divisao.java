import java.util.Locale;
import java.util.Scanner;

public class Divisao {

    private Integer qtd;
    private Double numerador;
    private Double denominador;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Divisao divisao = new Divisao();

        System.out.print("Quantos casos voce vai digitar?: ");
        divisao.setQtd(sc.nextInt());

        divisao.realizarDivisoes(sc);

        sc.close();
    }

    public void realizarDivisoes(Scanner sc) {
        for (Integer i = 1; i <= qtd; i++) {
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextDouble();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextDouble();

            if (isDivisaoImpossivel()) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                System.out.printf("DIVISAO = %.2f%n", getDivisao());
            }
        }
    }

    public Double getDivisao() {
        if (denominador == 0) {
            return 0.0;
        }
        return numerador / denominador;
    }

    public Boolean isDivisaoImpossivel() {
        return denominador == 0;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getNumerador() {
        return numerador;
    }

    public void setNumerador(Double numerador) {
        this.numerador = numerador;
    }

    public Double getDenominador() {
        return denominador;
    }

    public void setDenominador(Double denominador) {
        this.denominador = denominador;
    }
}