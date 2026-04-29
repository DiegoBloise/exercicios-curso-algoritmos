package exercicios3;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

    private Integer sapos;
    private Integer ratos;
    private Integer coelhos;
    private Integer n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Experiencias experiencias = new Experiencias();

        System.out.print("Quantos casos de teste serao digitados?: ");
        experiencias.setN(sc.nextInt());

        experiencias.processarCobaias(sc);

        sc.close();
    }

    public void processarCobaias(Scanner sc) {
        sapos = 0;
        coelhos = 0;
        ratos = 0;

        for (Integer i = 1; i <= n; i++) {
            System.out.print("Quantidade de cobaias: ");
            Integer qtd = sc.nextInt();

            System.out.print("Tipo de cobaia: ");
            String tipoCobaia = sc.next();

            switch (tipoCobaia) {
                case "S":
                    sapos += qtd;
                    break;
                case "R":
                    ratos += qtd;
                    break;
                case "C":
                    coelhos += qtd;
                    break;
            }
        }

        imprimirRelatorio();
    }

    public void processarCobaias(Integer[] quantities, String[] types) {
        sapos = 0;
        coelhos = 0;
        ratos = 0;

        for (Integer i = 0; i < quantities.length; i++) {
            Integer qtd = quantities[i];
            String tipoCobaia = types[i];

            switch (tipoCobaia) {
                case "S":
                    sapos += qtd;
                    break;
                case "R":
                    ratos += qtd;
                    break;
                case "C":
                    coelhos += qtd;
                    break;
            }
        }
    }

    public void imprimirRelatorio() {
        System.out.println();
        System.out.println("RELATORIO FINAL:");
        System.out.println("Total: " + getTotal() + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f%n", getPercentualCoelhos());
        System.out.printf("Percentual de ratos: %.2f%n", getPercentualRatos());
        System.out.printf("Percentual de sapos: %.2f%n", getPercentualSapos());
    }

    public Integer getTotal() {
        return sapos + ratos + coelhos;
    }

    public Double getPercentualCoelhos() {
        return (coelhos / (double) getTotal() * 100);
    }

    public Double getPercentualRatos() {
        return (ratos / (double) getTotal() * 100);
    }

    public Double getPercentualSapos() {
        return (sapos / (double) getTotal() * 100);
    }

    public Integer getSapos() {
        return sapos;
    }

    public void setSapos(Integer sapos) {
        this.sapos = sapos;
    }

    public Integer getRatos() {
        return ratos;
    }

    public void setRatos(Integer ratos) {
        this.ratos = ratos;
    }

    public Integer getCoelhos() {
        return coelhos;
    }

    public void setCoelhos(Integer coelhos) {
        this.coelhos = coelhos;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}