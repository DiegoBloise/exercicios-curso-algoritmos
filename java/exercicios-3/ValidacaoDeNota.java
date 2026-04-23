import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {

    private double n1;
    private double n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ValidacaoDeNota validacao = new ValidacaoDeNota();

        System.out.print("Digite a primeira nota: ");
        validacao.lerNotaValida(sc, true);

        System.out.print("Digite a segunda nota: ");
        validacao.lerNotaValida(sc, false);

        double media = (validacao.getN1() + validacao.getN2()) / 2.0;
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }

    public void lerNotaValida(Scanner sc, boolean primeiro) {
        double nota = -1;

        while (nota < 0 || nota > 10) {
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.print("Valor invalido! Tente novamente: ");
            }
        }

        if (primeiro) {
            setN1(nota);
        } else {
            setN2(nota);
        }
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
}
