package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {

    private Integer horaInicial, horaFinal, totalHoras;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        TempoDeJogo tj = new TempoDeJogo();

        System.out.print("Hora inicial: ");
        tj.setHoraInicial(sc.nextInt());
        System.out.print("Hora final: ");
        tj.setHoraFinal(sc.nextInt());

        System.out.printf("O JOGO DUROU %d HORA(S)", tj.getTotalHoras());

        sc.close();
    }

    public Integer getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Integer horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Integer getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Integer horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Integer getTotalHoras() {
        if (horaInicial > horaFinal) {
            totalHoras = (24 - horaInicial) + horaFinal;
        } else {
            if (horaFinal == horaInicial) {
                totalHoras = 24;
            } else {
                totalHoras = horaFinal - horaInicial;
            }
        }

        return totalHoras;
    }
}
