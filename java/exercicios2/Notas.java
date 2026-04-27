import java.util.Locale;
import java.util.Scanner;

public class Notas {

    private Double nota1;
    private Double nota2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Notas notas = new Notas();

        System.out.print("Digite a primeira nota: ");
        notas.setNota1(sc.nextDouble());

        System.out.print("Digite a segunda nota: ");
        notas.setNota2(sc.nextDouble());

        System.out.printf("NOTA FINAL = %.1f %s", notas.getNotaFinal(), notas.isReprovado() ? "\nREPROVADO" : "");

        sc.close();
    }

    public Double getNotaFinal() {
        return nota1 + nota2;
    }

    public Boolean isReprovado() {
        return getNotaFinal() < 60;
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
