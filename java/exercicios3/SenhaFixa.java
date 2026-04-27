import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {

    private static final Integer SENHA = 2002;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        SenhaFixa senhaFixa = new SenhaFixa();

        senhaFixa.validarSenha(sc);

        sc.close();
    }

    public void validarSenha(Scanner sc) {
        Integer tentativa;
        do {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextInt();
            if (!validar(tentativa)) {
                System.out.print("Senha Invalida! Tente novamente: ");
            }
        } while (!validar(tentativa));

        System.out.println("Acesso Permitido");
    }

    public Boolean validar(Integer tentativa) {
        return tentativa.equals(SENHA);
    }

    public String getMensagemErro() {
        return "Senha Invalida! Tente novamente: ";
    }

    public String getMensagemSucesso() {
        return "Acesso Permitido";
    }
}