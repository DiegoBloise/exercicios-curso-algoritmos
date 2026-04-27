import java.util.Locale;
import java.util.Scanner;

public class ParImpar {

    private Integer numero;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ParImpar parImpar = new ParImpar();

        System.out.print("Quantos numeros voce vai digitar?: ");
        Integer qtd = sc.nextInt();

        for (Integer i = 1; i <= qtd; i++) {
            System.out.print("Digite um numero: ");
            parImpar.setNumero(sc.nextInt());
            System.out.println(parImpar.getClassificacao());
        }

        sc.close();
    }

    public String getClassificacao() {
        if (numero == 0) {
            return "NULO";
        } else {
            String resultado = "";
            if (numero % 2 == 0) {
                resultado += "PAR ";
            } else {
                resultado += "IMPAR ";
            }

            if (numero < 0) {
                resultado += "NEGATIVO";
            } else {
                resultado += "POSITIVO";
            }
            return resultado;
        }
    }

    public Boolean isPar() {
        return numero % 2 == 0;
    }

    public Boolean isPositivo() {
        return numero > 0;
    }

    public Boolean isNulo() {
        return numero == 0;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}