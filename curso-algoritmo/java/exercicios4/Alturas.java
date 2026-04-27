import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    private List<String> nomes = new ArrayList<>();
    private List<Integer> idades = new ArrayList<>();
    private List<Double> alturas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Alturas alturas = new Alturas();

        System.out.print("Quantas pessoas serao digitadas?: ");
        Integer n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            alturas.getNomes().add(sc.nextLine());

            System.out.print("Idade: ");
            alturas.getIdades().add(sc.nextInt());

            System.out.print("Altura: ");
            alturas.getAlturas().add(sc.nextDouble());

            sc.nextLine();
        }

        System.out.printf("Altura media: %.2f\n", alturas.getMedia());
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", alturas.getPorcentagemMenores());
        System.out.println("Nomes:");
        for (String nome : alturas.getNomesMenores()) {
            System.out.println(nome);
        }

        sc.close();
    }

    public Double getPorcentagemMenores() {
        return Double.valueOf(getQtdMenores()) / alturas.size() * 100;
    }

    public List<String> getNomesMenores() {
        List<String> nomesMenores = new ArrayList<>();
        for (int i = 0; i < nomes.size(); i++) {
            if (idades.get(i) < 16) {
                nomesMenores.add(nomes.get(i));
            }
        }
        return nomesMenores;
    }

    public Integer getQtdMenores() {
        Integer qtdMenores = 0;
        for (int i = 0; i < idades.size(); i++) {
            if (idades.get(i) < 16) {
                qtdMenores++;
            }
        }
        return qtdMenores;
    }

    public Double getMedia() {
        Double soma = 0.0;
        for (int i = 0; i < alturas.size(); i++) {
            soma += alturas.get(i);
        }
        return soma / alturas.size();
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public List<Integer> getIdades() {
        return idades;
    }

    public void setIdades(List<Integer> idades) {
        this.idades = idades;
    }

    public List<Double> getAlturas() {
        return alturas;
    }

    public void setAlturas(List<Double> alturas) {
        this.alturas = alturas;
    }
}