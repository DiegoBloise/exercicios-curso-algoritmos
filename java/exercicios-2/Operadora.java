import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Operadora {

    private BigDecimal valorPlano;
    private Integer minutosPlano;
    private BigDecimal taxaMinutoExcedente;

    private Integer totalMinutoUtilizado;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Operadora operadora = new Operadora(new BigDecimal(50.0), 100, new BigDecimal(2.0));

        System.out.print("Digite a quantidade de minutos: ");
        operadora.setTotalMinutoUtilizado(sc.nextInt());

        System.out.printf("Valor a pagar: R$ %.2f", operadora.getTotal());

        sc.close();
    }

    public Operadora(BigDecimal valorPlano, Integer minutosPlano, BigDecimal taxaMinutoExcedente) {
        this.valorPlano = valorPlano;
        this.minutosPlano = minutosPlano;
        this.taxaMinutoExcedente = taxaMinutoExcedente;
    }

    public BigDecimal getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(BigDecimal valorPlano) {
        this.valorPlano = valorPlano;
    }

    public Integer getMinutosPlano() {
        return minutosPlano;
    }

    public void setMinutosPlano(Integer minutosPlano) {
        this.minutosPlano = minutosPlano;
    }

    public BigDecimal getTaxaMinutoExcedente() {
        return taxaMinutoExcedente;
    }

    public void setTaxaMinutoExcedente(BigDecimal taxaMinutoExcedente) {
        this.taxaMinutoExcedente = taxaMinutoExcedente;
    }

    public Integer getTotalMinutoUtilizado() {
        return totalMinutoUtilizado;
    }

    public void setTotalMinutoUtilizado(Integer totalMinutoUtilizado) {
        this.totalMinutoUtilizado = totalMinutoUtilizado;
    }

    public BigDecimal getTotal() {
        BigDecimal total = valorPlano;

        if (totalMinutoUtilizado > minutosPlano) {
            BigDecimal adicionalExcedente = taxaMinutoExcedente
                    .multiply(new BigDecimal(totalMinutoUtilizado - minutosPlano));
            total = total.add(adicionalExcedente);
        }

        return total;
    }
}