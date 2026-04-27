package cursoJava.exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    /*
     * CÓDIGO ESPECIFICAÇÃO PREÇO
     * 1 Cachorro Quente R$ 4,00
     * 2 X-Salada R$ 4,50
     * 3 X-Bacon R$ 5,00
     * 4 Torrada Simples R$ 2,00
     * 5 Refrigerante R$ 1,50
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o código do item e a quantidade: ");

        String entrada = sc.nextLine();

        int item = Integer.parseInt(entrada.split(" ")[0]);
        int quantidade = Integer.parseInt(entrada.split(" ")[1]);

        double valorTotal;
        switch (item) {
            case 1:
                valorTotal = quantidade * 4.00;
                break;
            case 2:
                valorTotal = quantidade * 4.50;
                break;
            case 3:
                valorTotal = quantidade * 5.00;
                break;
            case 4:
                valorTotal = quantidade * 2.00;
                break;
            case 5:
                valorTotal = quantidade * 1.50;
                break;
            default:
                valorTotal = 0.0;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
