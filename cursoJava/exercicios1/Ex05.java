package cursoJava.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite os dados da peça 1 (código, quantidade e valor): ");

        String peca1 = sc.nextLine();
        String[] peca1Dados = peca1.split(" ");

        // int codigoPeca1 = Integer.parseInt(peca1Dados[0]);
        int quantidadePeca1 = Integer.parseInt(peca1Dados[1]);
        double valorPeca1 = Double.parseDouble(peca1Dados[2]);

        System.out.print("Digite os dados da peça 2 (código, quantidade e valor): ");
        String peca2 = sc.nextLine();
        String[] peca2Dados = peca2.split(" ");

        // int codigoPeca2 = Integer.parseInt(peca2Dados[0]);
        int quantidadePeca2 = Integer.parseInt(peca2Dados[1]);
        double valorPeca2 = Double.parseDouble(peca2Dados[2]);

        double valorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
