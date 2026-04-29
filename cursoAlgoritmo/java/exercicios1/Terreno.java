package exercicios1;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Terreno {

    private Double larguraTerreno;
    private Double comprimentoTerreno;
    private BigDecimal valorMetroQuadrado;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Terreno terreno = new Terreno();

        Double areaTerreno;
        BigDecimal precoTerreno;

        System.out.print("Digite a largura do terreno: ");
        terreno.setLarguraTerreno(sc.nextDouble());

        System.out.print("Digite o comprimento do terreno: ");
        terreno.setComprimentoTerreno(sc.nextDouble());

        System.out.print("Digite o valor do metro quadrado: ");
        terreno.setValorMetroQuadrado(sc.nextBigDecimal());

        areaTerreno = terreno.getArea();
        precoTerreno = terreno.getPreco();

        System.out.printf("\nArea do terreno = %.2f", areaTerreno);
        System.out.printf("\nPreco do terreno = %.2f", precoTerreno);

        sc.close();
    }

    public Double getArea() {
        return larguraTerreno * comprimentoTerreno;
    }

    public BigDecimal getPreco() {
        return this.valorMetroQuadrado.multiply(new BigDecimal(this.getArea()));
    }

    public Double getLarguraTerreno() {
        return larguraTerreno;
    }

    public void setLarguraTerreno(Double larguraTerreno) {
        this.larguraTerreno = larguraTerreno;
    }

    public Double getComprimentoTerreno() {
        return comprimentoTerreno;
    }

    public void setComprimentoTerreno(Double comprimentoTerreno) {
        this.comprimentoTerreno = comprimentoTerreno;
    }

    public BigDecimal getValorMetroQuadrado() {
        return valorMetroQuadrado;
    }

    public void setValorMetroQuadrado(BigDecimal valorMetroQuadrado) {
        this.valorMetroQuadrado = valorMetroQuadrado;
    }
}
