package cursoJava.secao6.parte1;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o tipo de combustível (1-4): ");

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            int tipo = sc.nextInt();

            if (tipo == 4) {
                break;
            }

            switch (tipo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.print("Código inválido. Digite novamente: ");
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
