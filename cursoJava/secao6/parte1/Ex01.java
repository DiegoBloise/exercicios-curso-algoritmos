package cursoJava.secao6.parte1;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a senha: ");

        int tentativa = sc.nextInt();

        while (tentativa != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("");
            tentativa = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
