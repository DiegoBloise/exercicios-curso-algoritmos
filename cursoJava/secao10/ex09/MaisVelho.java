package cursoJava.secao10.ex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

    private List<String> nomes = new ArrayList<>();
    private List<Integer> idades = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        MaisVelho maisVelho = new MaisVelho();

        System.out.print("Quantas pessoas voce vai digitar?: ");
        Integer n = sc.nextInt();

        // Limpar buffer
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            maisVelho.getNomes().add(sc.nextLine());

            System.out.print("Idade: ");
            maisVelho.getIdades().add(sc.nextInt());

            // Limpar buffer
            sc.nextLine();
        }

        System.out.println("PESSOA MAIS VELHA: " + maisVelho.getNomeMaisVelho());

        sc.close();
    }

    public Integer getIdadeMaisVelho() {
        return idades.get(getMaisVelhoIndex());
    }

    public String getNomeMaisVelho() {
        return nomes.get(getMaisVelhoIndex());
    }

    public Integer getMaisVelhoIndex() {
        Integer maisVelhoIndex = 0;
        for (int i = 0; i < idades.size(); i++) {
            if (idades.get(i) > idades.get(maisVelhoIndex)) {
                maisVelhoIndex = i;
            }
        }
        return maisVelhoIndex;
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
}
