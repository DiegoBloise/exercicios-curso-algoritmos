import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {

    private Integer valor;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ParesConsecutivos paresConsecutivos = new ParesConsecutivos();

        paresConsecutivos.processar(sc);

        sc.close();
    }

    public void processar(Scanner sc) {
        while (true) {
            System.out.print("Digite um numero inteiro: ");
            valor = sc.nextInt();

            if (valor == 0) {
                break;
            }

            System.out.println("SOMA = " + getSoma());
        }
    }

    public Integer getSoma() {
        Integer start = valor;
        if (start % 2 != 0) {
            start++;
        }
        Integer soma = 0;
        for (Integer i = 0; i < 5; i++) {
            soma += start + (i * 2);
        }
        return soma;
    }

    public Boolean isEncerrar() {
        return valor == 0;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}