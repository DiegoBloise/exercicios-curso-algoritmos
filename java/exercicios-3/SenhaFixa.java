import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {

    private static final int SENHA = 2002;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SenhaFixa senhaFixa = new SenhaFixa();

        senhaFixa.validarSenha(sc);

        sc.close();
    }

    public void validarSenha(Scanner sc) {
        System.out.print("Digite a senha: ");
        int tentativa = sc.nextInt();

        while (tentativa != SENHA) {
            System.out.print("Senha Invalida! Tente novamente: ");
            tentativa = sc.nextInt();
        }

        System.out.println("Acesso permitido!");
    }
}
