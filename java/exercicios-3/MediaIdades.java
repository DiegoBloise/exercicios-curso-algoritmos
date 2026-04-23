import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {

    private double idade;
    private double soma;
    private int qtd;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MediaIdades mediaIdades = new MediaIdades();

        System.out.println("Digite as idades:");
        mediaIdades.calcularMedia(sc);

        sc.close();
    }

    public void calcularMedia(Scanner sc) {
        idade = 0;
        qtd = 0;
        soma = 0;

        while (idade >= 0) {
            idade = sc.nextDouble();

            if (idade >= 0) {
                soma += idade;
                qtd++;
            }
        }

        if (qtd > 1) {
            double media = soma / qtd;
            System.out.printf("MEDIA = %.2f%n", media);
        } else {
            System.out.println("IMPOSSIVEL CALCULAR");
        }
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
