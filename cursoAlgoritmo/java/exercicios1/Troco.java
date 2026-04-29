package exercicios1;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Troco {

    private BigDecimal precoUnitario;
    private Integer qtdComprada;
    private BigDecimal dinheiroRecebido;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Troco troco = new Troco();

        System.out.print("Preco unitario do produto: ");
        troco.setPrecoUnitario(sc.nextBigDecimal());

        System.out.print("Quantidade comprada: ");
        troco.setQtdComprada(sc.nextInt());

        System.out.print("Dinheiro recebido: ");
        troco.setDinheiroRecebido(sc.nextBigDecimal());

        System.out.printf("TROCO = R$ %.2f ", troco.getTotal());

        sc.close();
    }

    public BigDecimal getTotal() {
        return this.dinheiroRecebido.subtract(precoUnitario.multiply(new BigDecimal(qtdComprada)));
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
}
