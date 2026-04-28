package cursoJava.secao5;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a hora inicial e a hora final do jogo: ");

        String entrada = sc.nextLine();

        int horaInicial = Integer.parseInt(entrada.split(" ")[0]);
        int horaFinal = Integer.parseInt(entrada.split(" ")[1]);

        int totalHoras;

        if (horaInicial > horaFinal) {
            totalHoras = (24 - horaInicial) + horaFinal;
        } else {
            if (horaFinal == horaInicial) {
                totalHoras = 24;
            } else {
                totalHoras = horaFinal - horaInicial;
            }
        }

        System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");

        sc.close();
    }
}
