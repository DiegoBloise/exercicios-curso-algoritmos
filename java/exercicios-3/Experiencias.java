import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

    private int sapos;
    private int ratos;
    private int coelhos;
    private int n;

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

        for (int i = 1; i <= n; i++) {
            System.out.print("Quantidade de cobaias: ");
            int qtd = sc.nextInt();

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

        int total = sapos + ratos + coelhos;

        System.out.println();
        System.out.println("RELATORIO FINAL:");
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f%n", (coelhos / (double) total * 100));
        System.out.printf("Percentual de ratos: %.2f%n", (ratos / (double) total * 100));
        System.out.printf("Percentual de sapos: %.2f%n", (sapos / (double) total * 100));
    }

    public int getSapos() {
        return sapos;
    }

    public void setSapos(int sapos) {
        this.sapos = sapos;
    }

    public int getRatos() {
        return ratos;
    }

    public void setRatos(int ratos) {
        this.ratos = ratos;
    }

    public int getCoelhos() {
        return coelhos;
    }

    public void setCoelhos(int coelhos) {
        this.coelhos = coelhos;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
