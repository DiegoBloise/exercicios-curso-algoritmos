package exercicios1;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

    private String nome;
    private BigDecimal valorHora;
    private Double horasTrabalhadas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Pagamento pagamento = new Pagamento();

        System.out.print("Nome: ");
        pagamento.setNome(sc.nextLine());

        System.out.print("Valor por hora: ");
        pagamento.setValorHora(sc.nextBigDecimal());

        System.out.print("Horas trabalhadas: ");
        pagamento.setHorasTrabalhadas(sc.nextDouble());

        System.out.printf("O pagamento para %s deve ser %.2f", pagamento.getNome(), pagamento.getTotal());

        sc.close();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public BigDecimal getTotal() {
        return this.valorHora.multiply(new BigDecimal(this.horasTrabalhadas));
    }
}
