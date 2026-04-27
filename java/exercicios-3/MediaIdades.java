import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {

    private Double soma;
    private Integer qtd;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MediaIdades mediaIdades = new MediaIdades();

        System.out.println("Digite as idades:");
        mediaIdades.calcularMedia(sc);

        sc.close();
    }

    public void calcularMedia(Scanner sc) {
        Double idade = 0.0;
        soma = 0.0;
        qtd = 0;

        while (idade >= 0) {
            idade = sc.nextDouble();
            if (idade >= 0) {
                soma += idade;
                qtd++;
            }
        }

        if (qtd > 0) {
            System.out.printf("MEDIA = %.2f%n", soma / qtd);
        } else {
            System.out.println("IMPOSSIVEL CALCULAR");
        }
    }

    public void processar(Double[] idades) {
        soma = 0.0;
        qtd = 0;

        for (Double idade : idades) {
            if (idade >= 0) {
                soma += idade;
                qtd++;
            }
        }
    }

    public Double getMedia() {
        return soma / qtd;
    }

    public Boolean isImpossivelCalcular() {
        return qtd == 0;
    }

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
}