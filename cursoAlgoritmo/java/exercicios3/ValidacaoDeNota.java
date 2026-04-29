package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {

    private Double nota1;
    private Double nota2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ValidacaoDeNota validacao = new ValidacaoDeNota();

        System.out.print("Digite a primeira nota: ");
        validacao.setNota1(validacao.lerNotaValida(sc));

        System.out.print("Digite a segunda nota: ");
        validacao.setNota2(validacao.lerNotaValida(sc));

        System.out.printf("MEDIA = %.2f%n", validacao.getMedia());

        sc.close();
    }

    public Double lerNotaValida(Scanner sc) {
        Double nota = sc.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.print("Valor invalido! Tente novamente: ");
            nota = sc.nextDouble();
        }
        return nota;
    }

    public Double getMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public Boolean isNotaValida() {
        return nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
}