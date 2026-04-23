import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Aumento {

    private BigDecimal salario;
    private Double percent;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Aumento aumento = new Aumento();

        System.out.print("Digite o salario da pessoa: ");
        aumento.setSalario(sc.nextBigDecimal());

        System.out.printf("\nNovo salario = R$ %.2f", aumento.getNovoSalario());
        System.out.printf("\nAumento = R$ %.2f", aumento.getAumento());
        System.out.printf("\nPorcentagem = %.0f%%", aumento.getPorcentagemAumento());

        sc.close();
    }

    public BigDecimal getNovoSalario() {
        return this.salario.add(this.getAumento());
    }

    public Double getPorcentagemAumento() {
        return percent * 100;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
        this.calcular();
    }

    private void calcular() {
        if (this.salario.compareTo(BigDecimal.valueOf(1000)) <= 0) {
            this.percent = 0.20;
        } else if (this.salario.compareTo(BigDecimal.valueOf(1000)) > 0 &&
                this.salario.compareTo(BigDecimal.valueOf(3000)) <= 0) {
            this.percent = 0.15;
        } else if (this.salario.compareTo(BigDecimal.valueOf(3000)) > 0 &&
                this.salario.compareTo(BigDecimal.valueOf(8000)) <= 0) {
            this.percent = 0.10;
        } else if (this.salario.compareTo(BigDecimal.valueOf(8000)) > 0) {
            this.percent = 0.05;
        }
    }

    public BigDecimal getAumento() {
        return salario.multiply(new BigDecimal(percent));
    }
}