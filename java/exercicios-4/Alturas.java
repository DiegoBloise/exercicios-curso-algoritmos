import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    List<String> nomes = new ArrayList<>();
    List<Integer> idades = new ArrayList<>();
    List<Double> alturas = new ArrayList<>();

    List<String> nomesMenores = new ArrayList<>();
    Integer qtdMenores;

    Double soma, media;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Alturas alturas = new Alturas();

        System.out.print("Quantas pessoas serao digitadas?: ");
        Integer n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: ", i + 1);

            System.out.print("\nNome: ");
            alturas.nomes.add(sc.nextLine());

            System.out.print("Idade: ");
            alturas.idades.add(sc.nextInt());

            System.out.print("Altura: ");
            alturas.alturas.add(sc.nextDouble());

            sc.nextLine();
        }

        System.out.printf("\nAltura media: %.2f", alturas.getMedia());

        System.err.printf("\nPessoas com menos de 16 anos: %.1f%%", alturas.getPorcentagemMenores());
        System.out.println("\nNomes: " + alturas.getNomesMenores().toString());

        sc.close();
    }

    public Double getPorcentagemMenores() {
        return Double.valueOf(getQtdMenores()) / alturas.size() * 100;
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

    public List<String> getNomesMenores() {
        for (int i = 0; i < nomes.size() - 1; i++) {
            if (idades.get(i) < 16) {
                nomesMenores.add(nomes.get(i));
            }
        }
        return nomesMenores;
    }

    public Integer getQtdMenores() {
        qtdMenores = 0;
        for (int i = 0; i < idades.size() - 1; i++) {
            if (idades.get(i) < 16) {
                qtdMenores++;
            }
        }
        return qtdMenores;
    }

    public Double getMedia() {
        soma = 0.0;
        for (int i = 0; i < alturas.size(); i++) {
            soma += alturas.get(i);
        }
        return soma / alturas.size();
    }
}