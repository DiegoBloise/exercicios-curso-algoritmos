package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Idades {

    private String nomePrimeiraPessoa;
    private String nomeSegundaPessoa;

    private Integer idadePrimeiraPessoa;
    private Integer idadeSegundaPessoa;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Idades idades = new Idades();

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        idades.setNomePrimeiraPessoa(sc.nextLine());
        System.out.print("Idade: ");
        idades.setIdadePrimeiraPessoa(sc.nextInt());

        // Limpar buffer
        sc.nextLine();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        idades.setNomeSegundaPessoa(sc.nextLine());
        System.out.print("Idade: ");
        idades.setIdadeSegundaPessoa(sc.nextInt());

        System.out.printf("A idade média de %s e %s é de %.1f anos",
                idades.getNomePrimeiraPessoa(),
                idades.getNomeSegundaPessoa(),
                idades.getMediaIdade());

        sc.close();
    }

    public Double getMediaIdade() {
        return (this.idadePrimeiraPessoa + this.idadeSegundaPessoa) / 2.0;
    }

    public String getNomePrimeiraPessoa() {
        return nomePrimeiraPessoa;
    }

    public void setNomePrimeiraPessoa(String nomePrimeiraPessoa) {
        this.nomePrimeiraPessoa = nomePrimeiraPessoa;
    }

    public String getNomeSegundaPessoa() {
        return nomeSegundaPessoa;
    }

    public void setNomeSegundaPessoa(String nomeSegundaPessoa) {
        this.nomeSegundaPessoa = nomeSegundaPessoa;
    }

    public Integer getIdadePrimeiraPessoa() {
        return idadePrimeiraPessoa;
    }

    public void setIdadePrimeiraPessoa(Integer idadePrimeiraPessoa) {
        this.idadePrimeiraPessoa = idadePrimeiraPessoa;
    }

    public Integer getIdadeSegundaPessoa() {
        return idadeSegundaPessoa;
    }

    public void setIdadeSegundaPessoa(Integer idadeSegundaPessoa) {
        this.idadeSegundaPessoa = idadeSegundaPessoa;
    }
}