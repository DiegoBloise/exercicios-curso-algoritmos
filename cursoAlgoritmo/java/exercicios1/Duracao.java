package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {

    private Integer duracao;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Duracao dur = new Duracao();

        System.out.print("Digite a duracao em segundos: ");
        dur.setDuracao(sc.nextInt());

        System.out.printf("%d:%d:%d", dur.getHoras(), dur.getMinutos(), dur.getSegundos());

        sc.close();
    }

    public Integer getHoras() {
        return this.duracao / 3600;
    }

    public Integer getMinutos() {
        return (this.duracao % 3600) / 60;
    }

    public Integer getSegundos() {
        return this.duracao % 60;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
}