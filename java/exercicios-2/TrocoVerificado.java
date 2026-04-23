import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

    private BigDecimal precoUnitario;
    private Integer qtdComprada;
    private BigDecimal dinheiroRecebido;

    private BigDecimal totalCompra;

    private BigDecimal troco;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        TrocoVerificado trocoVerificado = new TrocoVerificado();

        System.out.print("Preco unitario do produto: ");
        trocoVerificado.setPrecoUnitario(sc.nextBigDecimal());

        System.out.print("Quantidade comprada: ");
        trocoVerificado.setQtdComprada(sc.nextInt());

        System.out.print("Dinheiro recebido: ");
        trocoVerificado.setDinheiroRecebido(sc.nextBigDecimal());

        trocoVerificado.calcular();

        sc.close();
    }

    public void calcular() {
        totalCompra = precoUnitario.multiply(BigDecimal.valueOf(qtdComprada));

        if (dinheiroRecebido.compareTo(totalCompra) >= 0) {
            troco = dinheiroRecebido.subtract(totalCompra);
            System.out.printf("TROCO = RS %.2f", troco);
        } else {
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f", totalCompra.subtract(dinheiroRecebido));
        }
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Integer getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(Integer qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public BigDecimal getDinheiroRecebido() {
        return dinheiroRecebido;
    }

    public void setDinheiroRecebido(BigDecimal dinheiroRecebido) {
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public BigDecimal getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(BigDecimal totalCompra) {
        this.totalCompra = totalCompra;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }
}
